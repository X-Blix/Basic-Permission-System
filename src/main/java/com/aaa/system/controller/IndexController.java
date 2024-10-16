package com.aaa.system.controller;

import com.aaa.common.result.Result;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/*
* 后台登录登出*/
@Api(tags = "后台登录管理")
@RestController
@RequestMapping("/admin/system/index")
public class IndexController {
//    @Autowired
//    private SysUserService sysUserService;

    //登录 ： 登录使用post请求
    /*
    * {"code":20000,"data":{"token":"admin-token"}}
    * */
    @PostMapping("/login")
    public Result login(){
        Map<String,Object> map = new HashMap<>();
        map.put("token","admin-token");
        return Result.ok(map);
    }

    //获取用户信息：使用get请求
    /*
    * {
    "code": 20000,
    "data": {
        "roles": [
            "admin"
        ],
        "introduction": "I am a super administrator",
        "avatar": "https://wpimg.wallstcn.com/f778738c-e4f8-4870-b634-56703b4acafe.gif",
        "name": "Super Admin"
    }
}
    * */
    @GetMapping("/info")
    public Result info(){
        Map<String,Object> map = new HashMap<>();
        map.put("roles","[admin]");
        map.put("introduction","I am a super administrator");
        map.put("avatar","https://wpimg.wallstcn.com/f778738c-e4f8-4870-b634-56703b4acafe.gif");
        map.put("name","Super Admin XBlix");
        return Result.ok(map);
    }

}
