package com.bestrookie.provider;

import com.bestrookie.framework.URL;
import com.bestrookie.framework.protocol.http.HttpServer;
import com.bestrookie.framework.register.LocalRegister;
import com.bestrookie.framework.register.RemoteMapRegister;
import com.bestrookie.provider.api.HelloService;
import com.bestrookie.provider.impl.HelloServiceImpl;

/**
 * @author bestrookie
 * @version 1.0
 * @date 2022/10/23 12:16
 */
public class Provider {
    public static void main(String[] args) throws Exception {
        LocalRegister.regist(HelloService.class.getName(), HelloServiceImpl.class);

        URL url = new URL("localhost",8080);
        RemoteMapRegister.regist(HelloService.class.getName(),url);

        HttpServer httpServer = new HttpServer();
        httpServer.start(url.getHostName(),url.getPort());
    }
}
