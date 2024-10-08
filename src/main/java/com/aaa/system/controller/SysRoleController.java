package com.aaa.system.controller;

import com.aaa.model.system.SysRole;
import com.aaa.system.service.SysRoleService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.xml.transform.Result;
import java.util.List;

@CrossOrigin
@Api(tags = "角色管理")
@RestController
@RequestMapping("/admin/system/sysRole")
public class SysRoleController {
    @Autowired
    private SysRoleService sysRoleService;

    //1.查询所有记录
    @ApiOperation(value = "获取全部角色列表")
    @GetMapping("/findAll")
    public List<SysRole> findAll(){
        List<SysRole> roleList = sysRoleService.list(); //localhost:5240/admin/system/sysRole/findAll
        return roleList;
    }

    //2.删除逻辑接口
    @ApiOperation(value = "删除角色")
    @DeleteMapping("/remove/{id}")  //localhost:5240/admin/system/sysRole/remove/2
    public boolean removeRole(@PathVariable String id){
        return sysRoleService.removeById(id);
    }




}
