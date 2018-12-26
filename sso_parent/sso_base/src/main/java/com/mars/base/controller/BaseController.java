package com.mars.base.controller;

import com.mars.base.domain.AdminInfo;
import com.mars.base.servicce.AdminInfoService;
import com.mars.domain.eneity.Resault;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
@CrossOrigin
@RequestMapping("/adminInfo")
public class BaseController {

    @Autowired
    private AdminInfoService adminInfoService;
    @Autowired
    HttpServletRequest request;

    @GetMapping("/list")
    public Resault listAll(){
        adminInfoService.listAll();
        return new Resault("查询成功",20000,null);
    }

    @RequestMapping(value = "/{adminId}",method = RequestMethod.GET)
    public Resault getByToken(@PathVariable("adminId") String adminId){
        AdminInfo adminInfo = adminInfoService.getById(adminId);
        String header = request.getHeader("authorization");
        System.out.println(header);
        return new Resault("查询成功",20000,adminInfo);
    }

    @RequestMapping(method = RequestMethod.POST)
    public Resault save(@RequestBody AdminInfo adminInfo){
        adminInfoService.save(adminInfo);
        return new Resault("查询成功",20000,null);
    }

    @RequestMapping(value = "/{adminId}",method = RequestMethod.PUT)
    public Resault updateById(@PathVariable("adminId") String adminId,@RequestBody AdminInfo adminInfo){
        return new Resault("修改成功",20000,null);
    }

    @RequestMapping(value = "/{adminId}",method = RequestMethod.DELETE)
    public Resault deleteById(@PathVariable("adminId") String adminId){
        return new Resault("删除成功",20000,null);
    }
}
