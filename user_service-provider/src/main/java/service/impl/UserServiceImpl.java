package service.impl;

import dto.UserAddress;
import service.UserService;

import java.util.Arrays;
import java.util.List;

/**
 * @author bestrookie
 * @version 1.0
 * @date 2022/10/16 21:57
 */
public class UserServiceImpl implements UserService {
    @Override
    public List<UserAddress> getUserAddressList(String userId) {
        UserAddress addressOne = new UserAddress(1,"山东省青岛市","1","2","3","1");
        UserAddress addressTwo = new UserAddress(2,"山东省青岛市李沧区","2","3","4","2");
        return Arrays.asList(addressOne,addressTwo);
    }
}
