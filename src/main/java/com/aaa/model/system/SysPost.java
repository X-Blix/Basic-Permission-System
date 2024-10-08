package com.aaa.model.system;

import com.aaa.model.base.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import io.swagger.annotations.ApiModelProperty;

public class SysPost extends BaseEntity {
    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "岗位编码")
    @TableField("post_code")
    private String postCode;

    @ApiModelProperty(value = "岗位名称")
    @TableField("name")
    private String name;

    @ApiModelProperty(value = "显示顺序")
    @TableField("description")
    private String description;

    @ApiModelProperty(value = "状态（1正常 0停用）")
    @TableField("status")
    private Integer status;

}
