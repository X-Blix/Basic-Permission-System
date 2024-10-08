package com.aaa.model.base;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Data
public class BaseEntity implements Serializable {

    @TableId(type = IdType.ASSIGN_ID)
    private String id;

    @TableField(value = "create_time",fill = FieldFill.INSERT)
    private Date createTime;

    @TableField(value = "update_time",fill = FieldFill.INSERT_UPDATE)
    private Date updateTime;

    @TableLogic  //逻辑删除 默认效果 0 没有删除 1 已经删除
    @TableField(value = "is_deleted",fill = FieldFill.INSERT)
    private Integer isDeleted;

    //存储临时信息（不需要被保存到数据库里的数据）
    @TableField(exist = false)
    private Map<String,Object> param = new HashMap<>();
}
