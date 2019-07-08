package com.mars.web.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class WebZullApplication {
    public static void main(String[] args) {
        SpringApplication.run(WebZullApplication.class,args);
    }
}
