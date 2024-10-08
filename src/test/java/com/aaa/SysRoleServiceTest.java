package com.aaa;

import com.aaa.model.system.SysRole;
import com.aaa.system.service.SysRoleService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class SysRoleServiceTest {

    //注入Service
    @Autowired
    private SysRoleService sysRoleService;

    //查询所有
    @Test
    public void findAll(){
        //service方法实现
        List<SysRole> list = sysRoleService.list();
        System.out.println(list);
    }

    //添加
    @Test
    public void add(){
        SysRole sysRole = new SysRole();
        sysRole.setRoleName("添加的测试");
        sysRole.setRoleCode("tianjiaceshi");
        sysRole.setDescription("添加的测试注释");
        sysRoleService.save(sysRole);
    }

    //修改
    @Test
    public void update(){
        SysRole sysRole = sysRoleService.getById(6L);
        sysRole.setDescription("test");
        sysRoleService.updateById(sysRole); //不要加save,会报错
    }

    //删除
    @Test
    public void remove(){
        sysRoleService.removeById(8);
    }

    //条件查询
    @Test
    public void select(){
        QueryWrapper<SysRole> wrapper = new QueryWrapper<>();
        wrapper.eq("role_code","testManager"); // SELECT * FROM sys_role WHERE role_code ='testManager';
        List<SysRole> list = sysRoleService.list(wrapper);
        System.out.println(list);
    }


}
