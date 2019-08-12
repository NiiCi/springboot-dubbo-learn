package com.dubbo.common.service;

import com.dubbo.common.bean.UserAddress;

import java.util.List;

public interface OrderService {
    public List<UserAddress> initOrder(String userId);
}
