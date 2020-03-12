package com.example.userprovider.userservice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserService {
    private Logger logger = LoggerFactory.getLogger(UserService.class);
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public  String login(@RequestParam("count") int count) throws  Exception {
        logger.info("access @ provider 8080 as " + count);
        return "用户已验证";
    }
    /*public  boolean login(@RequestBody User user) throws  Exception {
        return "admin".equals(user.getUsername()) && "12345".equals(user.getPassword());
    }*/
    /*public  boolean login(@RequestParam("name") String name, @RequestParam("pwd") String pwd) throws  Exception {
        return "admin".equals(name) && "12345".equals(pwd);
    }*/

}
