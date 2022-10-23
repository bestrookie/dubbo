package com.bestrookie.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import dto.UserAddress;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.OrderService;
import service.UserService;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author bestrookie
 * @version 1.0
 * @date 2022/10/16 22:06
 */
@Service
public class OrderServiceImpl implements OrderService {
    @Reference
    UserService userService;
    @HystrixCommand(fallbackMethod = "hello")
    @Override
    public List<UserAddress> initOrder(String userId) {
        System.out.println("userId: " + userId);
        List<UserAddress> list = userService.getUserAddressList(userId);
        for (UserAddress address : list) {
            System.out.println(address.toString());
        }
        return list;

    }

    public List<UserAddress> hello(String userId){
        return Collections.singletonList(new UserAddress(10, "hystrix回调", "1", "1", "1", "1"));
    }
}
