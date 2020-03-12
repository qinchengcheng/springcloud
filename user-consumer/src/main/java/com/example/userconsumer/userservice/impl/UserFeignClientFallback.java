package com.example.userconsumer.userservice.impl;

import com.example.userconsumer.userservice.UserFeignClient;
import org.springframework.stereotype.Component;

@Component
public class UserFeignClientFallback implements UserFeignClient {
    @Override
    public String login(int count) {
        return "异常";
    }
}
