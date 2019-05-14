package com.mars.auth.controller;

import com.mars.domain.eneity.Resault;
import com.mars.auth.client.BaseClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.logging.Logger;

@RestController
@CrossOrigin
@RequestMapping("oauth")
public class OauthController {

    @Autowired
    private BaseClient baseClient;
    @Autowired
    private RestTemplate restTemplate;

    private final Logger logger = Logger.getLogger("OauthController");

    @RequestMapping(value = "/adminInfo/{adminId}",method = RequestMethod.GET)
    public Resault getAdminInfoById(@PathVariable String adminId){
        //return baseClient.getByToken(adminId);
        return restTemplate.getForObject("http://SSO-BASE/adminInfo/{adminId}", Resault.class,1);
    }


    @RequestMapping(value = "/trace-2",method = RequestMethod.GET)
    public String trace(){
        logger.info("==================<call trace-2>===========");
        return "Trace";
    }
}
