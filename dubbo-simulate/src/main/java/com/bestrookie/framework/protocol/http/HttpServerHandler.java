package com.bestrookie.framework.protocol.http;

import com.bestrookie.framework.Invocation;
import com.bestrookie.framework.register.LocalRegister;
import org.apache.commons.io.IOUtils;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.ObjectInputStream;
import java.lang.reflect.Method;

/**
 * @author bestrookie
 * @version 1.0
 * @date 2022/10/23 13:25
 */
public class HttpServerHandler  {
    public void handle(HttpServletRequest request, HttpServletResponse response) throws Exception {
        Invocation invocation = (Invocation) new ObjectInputStream(request.getInputStream()).readObject();

        Class clazz = LocalRegister.get(invocation.getInterfaceName());
        Method method = clazz.getMethod(invocation.getMethodName(), invocation.getParamsTypes());
        String result =(String) method.invoke(clazz.newInstance(), invocation.getParams());

        IOUtils.write(result.getBytes(

        ),response.getOutputStream());


    }
}
