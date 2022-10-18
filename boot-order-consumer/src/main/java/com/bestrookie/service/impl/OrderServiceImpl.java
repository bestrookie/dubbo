package com.bestrookie.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import dto.UserAddress;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.OrderService;
import service.UserService;

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
    @Override
    public List<UserAddress> initOrder(String userId) {
        System.out.println("userId: " + userId);
        List<UserAddress> list = userService.getUserAddressList(userId);
        for (UserAddress address : list) {
            System.out.println(address.toString());
        }
        return list;

    }
}
