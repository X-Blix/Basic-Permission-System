package com.aaa.system.mapper;

import com.aaa.model.system.SysRole;
import com.aaa.model.vo.SysRoleQueryVo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface SysRoleMapper extends BaseMapper<SysRole> {
    IPage<SysRole> selectPage(Page<SysRole> page, @Param("vo") SysRoleQueryVo roleQueryVo);
}
