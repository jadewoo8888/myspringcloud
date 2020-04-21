package com.wu.springcloudhystrix.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description TODO
 * @Author 13006
 * @Date 2020/4/2 11:17
 **/

@Service
public class UserService {

    @Autowired
    private UserFeign userFeign;

    @HystrixCommand(fallbackMethod = "userError")
    public String getUser() {
        return userFeign.getUser();
    }

    public String userError() {
        return " user error";
    }
}
