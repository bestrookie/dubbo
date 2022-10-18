package com.bestrookie.controller;

import dto.UserAddress;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.OrderService;

import java.util.List;

/**
 * @author bestrookie
 * @date 2022/10/18 10:14
 */
@RestController
@RequestMapping("/get")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @GetMapping("/getUser")
    public List<UserAddress> initOrder(){
        List<UserAddress> userAddresses = orderService.initOrder("1");
        return userAddresses;

    }
}
