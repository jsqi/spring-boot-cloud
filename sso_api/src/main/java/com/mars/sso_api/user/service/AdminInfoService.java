package com.mars.sso_api.user.service;

import com.mars.sso_api.common.Resault;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping("/adminInfo")
public interface AdminInfoService {

    @RequestMapping(value = "/adminInfo/{adminId}",method = RequestMethod.GET)
    Resault getByToken(@PathVariable("adminId") String adminId);

    @RequestMapping(value = "/adminInfo/hello2/{id}",method = RequestMethod.GET)
    String HelloTest(@PathVariable("id") String id);
}
