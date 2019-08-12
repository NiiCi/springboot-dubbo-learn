package com.dubbo.provider.service.impl;

import com.dubbo.common.bean.UserAddress;
import com.dubbo.common.service.UserService;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@com.alibaba.dubbo.config.annotation.Service // 暴露服务
@Service("userService")
public class UserServiceImpl implements UserService {
    public List<UserAddress> getUserAddressList(String userId) {
        UserAddress address1 = new UserAddress(1,"浙江杭州",1L,"niici","17826877753","Y");
        UserAddress address2 = new UserAddress(2,"浙江宁波",2L,"niici2","17826877753","Y");
        return Arrays.asList(address1,address2);
    }
}
