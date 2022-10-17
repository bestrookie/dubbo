package service.impl;

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
    @Autowired
    UserService userService;
    @Override
    public void initOrder(String userId) {
        System.out.println("userId: " + userId);
        List<UserAddress> list = userService.getUserAddressList(userId);
        for (UserAddress address : list) {
            System.out.println(address.toString());
        }

    }
}
