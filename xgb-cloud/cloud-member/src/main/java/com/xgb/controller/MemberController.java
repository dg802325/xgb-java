package com.xgb.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: 邓根
 * @Date: 2019/9/26 16:44
 * @Description:
 */
@RestController
public class MemberController {

    @Value("${server.port}")
    String port;
    @GetMapping("/hi")
    public String home(@RequestParam String name) {
        return "hi "+name+",i am from port:" +port;
    }
}
