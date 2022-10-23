package com.bestrookie.provider.impl;

import com.bestrookie.provider.api.HelloService;

/**
 * @author bestrookie
 * @version 1.0
 * @date 2022/10/23 12:58
 */
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello(String userName) {
        return "Hello:"+userName;
    }
}
