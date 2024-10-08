package com.aaa.model.base;

import com.baomidou.mybatisplus.annotation.TableField;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

@Data
public class TreeEntity extends  BaseEntity {
    @ApiModelProperty(value = "名称")
    @TableField("name")
    private String name;

    @ApiModelProperty(value = "上级分类id")
    @TableField("parent_id")
    private String parentId;

    @ApiModelProperty(value = "排序")
    @TableField("sort_value")
    private Integer sortValue;

    @ApiModelProperty(value = "下级所有分类")
    @TableField(exist = false)
    private List<TreeEntity> children;
}
