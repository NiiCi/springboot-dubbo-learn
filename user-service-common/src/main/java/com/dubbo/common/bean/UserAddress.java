package com.dubbo.common.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserAddress implements Serializable {
    private Integer id;
    private String userAddress; // 用户地址
    private Long userId;
    private String consignee; //收货人
    private String phoneNum; //电话号码
    private String isDefault; //是否为默认地址 Y - 是 N - 否
}
