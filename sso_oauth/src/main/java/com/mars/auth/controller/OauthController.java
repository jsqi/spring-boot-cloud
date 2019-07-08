package com.mars.auth.controller;

import com.mars.auth.client.BaseClient;
import com.mars.domain.eneity.Resault;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.logging.Logger;

@RestController
@CrossOrigin
@RequestMapping("oauth")
public class OauthController {

    @Autowired
    private BaseClient baseClient;

    private final Logger logger = Logger.getLogger("OauthController");

    @RequestMapping(value = "/adminInfo/{adminId}",method = RequestMethod.GET)
    public Resault getAdminInfoById(@PathVariable String adminId){
        return baseClient.getByToken(adminId);
    }


    @RequestMapping(value = "/helloTest/{id}",method = RequestMethod.GET)
    @ResponseBody
    public String helloTest(@PathVariable String id){
        return baseClient.HelloTest(id);
    }
}
