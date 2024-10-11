package com.aaa.system.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.aaa.common.result.Result;
import com.aaa.model.system.SysRole;
import com.aaa.model.vo.AssginRoleVo;
import com.aaa.model.vo.SysRoleQueryVo;
import com.aaa.system.service.SysRoleService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

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
    public Result<List<SysRole>> findAll(){
        List<SysRole> roleList = sysRoleService.list(); //localhost:5240/admin/system/sysRole/findAll
        return Result.ok(roleList);
    }

    //2.删除逻辑接口
    @ApiOperation(value = "删除角色")
    @DeleteMapping("/remove/{id}")  //localhost:5240/admin/system/sysRole/remove/2
    public Result removeRole(@PathVariable String id){
        boolean isSucess = sysRoleService.removeById(id);
        if (isSucess){
            return Result.ok();
        }else{
            return Result.fail();
        }
    }

    //3.条件分页查询
    @ApiOperation(value = "条件分页查询")
    @GetMapping("/{page}/{limit}")
    public Result findPageQueryRole(
//            @ApiParam(name = "page", value = "当前页码", required = true)
            @PathVariable Long page,

//            @ApiParam(name = "limit", value = "每页记录数", required = true)
            @PathVariable Long limit,

//            @ApiParam(name = "roleQueryVo", value = "查询对象", required = false)
            SysRoleQueryVo roleQueryVo) {
        Page<SysRole> pageParam = new Page<>(page, limit);
        IPage<SysRole> pageModel = sysRoleService.selectPage(pageParam, roleQueryVo);
        return Result.ok(pageModel);
    }


}
