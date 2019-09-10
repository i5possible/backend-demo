package com.lianghong.aws.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lianghong
 * @date 2019/9/9
 */

@RestController("hello")
public class DemoController {

    @GetMapping
    public String helloWorld() {
        return "Hello World";
    }
}
