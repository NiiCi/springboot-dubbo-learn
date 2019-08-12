package com.dubbo.consumer;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableDubbo // 开启基于注解的 dubbo 功能
@SpringBootApplication
public class UserServiceConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(UserServiceConsumerApplication.class,args);
    }
}
