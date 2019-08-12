package com.dubbo.common.service;


import com.dubbo.common.bean.UserAddress;

import java.util.List;

public interface UserService {
    public List<UserAddress> getUserAddressList(String userId);
}
