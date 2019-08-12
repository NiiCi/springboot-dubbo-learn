package com.dubbo.consumer.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.dubbo.common.bean.UserAddress;
import com.dubbo.common.service.OrderService;
import com.dubbo.common.service.UserService;
import javafx.print.Collation;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@com.alibaba.dubbo.config.annotation.Service
@Service("orderService")
@Log4j2
public class OrderServiceImpl implements OrderService {
    /**
     * 在服务消费者中不能使用 @Autowired 注解
     * 只能使用 @Reference 注解 注入 UserService
     */
    @Reference
    private UserService userService;

    public List<UserAddress> initOrder(String userId) {
        //1.查询用户收获地址
        log.info("用户id: "+userId);
        List<UserAddress> addressList = userService.getUserAddressList(userId);
        return  addressList == null ?  null :  addressList;
    }
}
