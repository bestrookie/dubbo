package service;

import dto.UserAddress;

import java.util.List;

/**
 * @author bestrookie
 * @version 1.0
 * @date 2022/10/16 22:05
 */
public interface OrderService {
     List<UserAddress> initOrder(String userId);
}
