package com.mars.sso.hystrix.dashboard.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HystrixIndexController {

    @GetMapping("")
    public String index() {
        return "forward:/hystrix";
    }

    @Value("${server.port}")
    String port;

    @RequestMapping("/hi")
    @ResponseBody
    @HystrixCommand(fallbackMethod = "hiError")
    public String home( String name) {
        return "hi "+name+",i am from port:" +port;
    }

    public String hiError(String name) {
        return "hi,"+name+",sorry,error!";
    }

}
