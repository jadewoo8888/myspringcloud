package com.wu.springcloudhystrix.controller;

import com.wu.springcloudhystrix.service.OrderFeignApi;
import com.wu.springcloudhystrix.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description TODO
 * @Author 13006
 * @Date 2020/4/21 15:13
 **/

@RestController
public class HystrixFeignMethodController {

    @Autowired
    private UserService userService;


    @GetMapping("user/method")
    public String getUser() {
        return userService.getUser();
    }


}
