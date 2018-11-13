package com.liuzhengliang.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by
 *
 * @Auther:liuzhengliang
 * @Date: 2018/11/9
 */
@RestController
public class HelloController {

    @RequestMapping("/")
    public String index() {
        return "Hello World";
    }

}