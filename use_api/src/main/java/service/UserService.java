package service;

import dto.UserAddress;

import java.util.List;

/**
 * @author bestrookie
 * @version 1.0
 * @date 2022/10/16 21:56
 */
public interface UserService {
    public List<UserAddress> getUserAddressList(String userId);
}
