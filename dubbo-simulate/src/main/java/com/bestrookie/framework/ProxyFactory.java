package com.bestrookie.framework;

import com.bestrookie.framework.protocol.http.HttpClient;
import com.bestrookie.framework.register.RemoteMapRegister;
import com.bestrookie.provider.api.HelloService;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.List;

/**
 * @author bestrookie
 * @version 1.0
 * @date 2022/10/23 16:14
 */
public class ProxyFactory {
    public static <T> T getProxy(final Class interfaceClass){
        Object o = Proxy.newProxyInstance(ProxyFactory.class.getClassLoader(), new Class[]{interfaceClass}, new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                HttpClient httpClient = new HttpClient();
                Invocation invocation = new Invocation(interfaceClass.getName(),method.getName(), method.getParameterTypes(), args);

                List<URL> urls = RemoteMapRegister.get(interfaceClass.getName());

                URL url = LoadBalance.random(urls);

                return httpClient.send(url.getHostName(),url.getPort(),invocation);
            }
        });
        return (T) o;
    }
}
