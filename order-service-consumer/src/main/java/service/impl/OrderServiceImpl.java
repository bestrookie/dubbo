package service.impl;

import dto.UserAddress;
import service.OrderService;
import service.UserService;

import java.util.List;

/**
 * @author bestrookie
 * @version 1.0
 * @date 2022/10/16 22:06
 */
public class OrderServiceImpl implements OrderService {
    UserService userService;
    @Override
    public void initOrder(String userId) {
        List<UserAddress> list = userService.getUserAddressList(userId);
        System.out.println(list);

    }
}
