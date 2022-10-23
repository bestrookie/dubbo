package com.bestrookie.consumer;

import com.bestrookie.framework.Invocation;
import com.bestrookie.framework.ProxyFactory;
import com.bestrookie.framework.protocol.http.HttpClient;
import com.bestrookie.provider.api.HelloService;

/**
 * @author bestrookie
 * @version 1.0
 * @date 2022/10/23 15:53
 */
public class Consumer {
    public static void main(String[] args) throws Exception {
        HelloService helloService = ProxyFactory.getProxy(HelloService.class);
        String result = helloService.sayHello("bestrookie yyyy");
        System.out.println(result);

    }
}
