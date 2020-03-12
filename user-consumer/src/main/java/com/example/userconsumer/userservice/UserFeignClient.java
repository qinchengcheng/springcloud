package com.example.userconsumer.userservice;


import com.example.userconsumer.userservice.impl.UserFeignClientFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "dm-user-provider", fallback = UserFeignClientFallback.class)
public interface UserFeignClient {

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    //public  boolean login(@RequestBody User user);

    //public  boolean login(@RequestParam("name") String name, @RequestParam("pwd") String pwd);
    //@RequestMapping(value = "/login", method = RequestMethod.GET)
    public  String login(@RequestParam("count") int count);
}
