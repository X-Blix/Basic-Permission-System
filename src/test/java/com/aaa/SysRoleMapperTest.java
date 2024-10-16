package com.aaa;

import com.aaa.model.system.SysRole;
import com.aaa.system.mapper.SysRoleMapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

@SpringBootTest
public class SysRoleMapperTest {
    @Autowired
    private SysRoleMapper sysRoleMapper;

    //7.条件删除
    @Test
    public void testDelete(){
        QueryWrapper<SysRole> wrapper = new QueryWrapper<>();
        wrapper.eq("role_name","用户管理员");
        sysRoleMapper.delete(wrapper);
    }

    //6.条件查询
    @Test
    public void testSelect(){
        //创建条件构造器对象
        QueryWrapper<SysRole> wrapper = new QueryWrapper<>();
        //设置条件
        wrapper.eq("role_name","用户管理员"); //SELECT * FROM sys_role WHERE role_name LIKE '%用户管理员%';
        //调用方法查询
        List<SysRole> list = sysRoleMapper.selectList(wrapper);
        System.out.println(list);
    }


    //5.批量删除
    @Test
    public void testBatchDelete(){
        sysRoleMapper.deleteBatchIds(Arrays.asList(1,2,3));
    }

    //4.id删除
    @Test
    public void delete() {
        int result = sysRoleMapper.deleteById(2L);//2(Long)//需要类型转换，不然会报错
        System.out.println(result);

    }

    //3.修改操作
    @Test
            public void update(){
    //根据id查询
   SysRole sysRole = sysRoleMapper.selectById(1);
    //设置修改值
    sysRole.setDescription("角色管理员");
    //调用方法进行修改
        sysRoleMapper.updateById(sysRole);
}
    //2.添加记录
    @Test
    public void add(){
        SysRole sysRole = new SysRole();
        sysRole.setRoleName("测试角色1");
        sysRole.setRoleCode("testManager1");
        sysRole.setDescription("aaaaaaaaa1");
        int rows = sysRoleMapper.insert(sysRole); //影响行数
        System.out.println(rows);
    }


    //1.查询表中所有记录
    @Test
    public void findAll(){
        List<SysRole> list = sysRoleMapper.selectList(null);
        for (SysRole sysRole:list) {
            System.out.println(sysRole);
        }
    }
}
