package service.impl;

import dto.UserAddress;
import lombok.AllArgsConstructor;
import org.jboss.netty.util.internal.StringUtil;
import org.springframework.util.StringUtils;
import service.UserService;

import java.util.List;

/**
 * @author bestrookie
 * @version 1.0
 * @date 2022/10/18 21:58
 */
@AllArgsConstructor
public class UserServiceStub implements UserService {
    private final UserService userService;

    @Override
    public List<UserAddress> getUserAddressList(String userId) {
        System.out.println("userServiceStub");
        if (!StringUtils.isEmpty(userId)){
           return userService.getUserAddressList(userId);
        }
        return null;
    }
}
