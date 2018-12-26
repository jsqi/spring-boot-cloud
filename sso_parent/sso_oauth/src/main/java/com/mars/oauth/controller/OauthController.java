package com.mars.oauth.controller;

import com.mars.domain.eneity.Resault;
import com.mars.oauth.client.BaseClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("oauth")
public class OauthController {

    @Autowired
    BaseClient baseClient;

    @RequestMapping(value = "/adminInfo/{adminId}",method = RequestMethod.GET)
    public Resault getAdminInfoById(@PathVariable String adminId){
       return baseClient.getByToken(adminId);
    }
}
