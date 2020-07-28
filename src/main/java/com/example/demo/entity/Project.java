package com.example.demo.entity;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 数据库模型
 * @author Ray
 * @since 2020-07-26
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("project")
public class Project implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 项目编码
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 项目名称
     */
    @TableField("project_name")
    private String projectName;

    /**
     * 单位
     */
    @TableField("unit")
    private String unit;

    /**
     * 性质
     */
    @TableField("nature")
    private String nature;

    /**
     * 计划值
     */
    @TableField("plan_value")
    private BigDecimal planValue;

    /**
     * 创建时间
     */
    @TableField("create_time")
    private Date createTime;

    /**
     * 修改时间
     */
    @TableField("modify_time")
    private Date modifyTime;

    /**
     * 是否可用标志
     */
    @TableField("flag")
    private Boolean flag;


}
