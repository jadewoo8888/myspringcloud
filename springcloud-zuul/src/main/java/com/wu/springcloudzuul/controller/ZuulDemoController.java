package com.wu.springcloudzuul.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description TODO
 * @Author 13006
 * @Date 2020/4/21 11:58
 **/

@RestController
public class ZuulDemoController {

    @GetMapping("testZuul")
    public String testZuul() {
        return "zuul";
    }
}
