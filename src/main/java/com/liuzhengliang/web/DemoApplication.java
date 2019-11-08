package com.liuzhengliang.web;

import com.liuzhengliang.web.controller.HelloController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 11.@EnableAutoConfiguration。这个注释告诉Spring Boot根据你添加的jar依赖关系“猜测”你想要如何配置Spring
 * 16.如果发现正在应用您不需要的特定自动配置类，则可以使用exclude属性@EnableAutoConfiguration禁用它们
 */
@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
