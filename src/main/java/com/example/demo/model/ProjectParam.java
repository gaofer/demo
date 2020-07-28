package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**实体类 用于与前端交互的模型
 * @ClassName ProjectParam
 * @Description //TODO
 * @Author Ray
 * @Date 2020/7/25 23:03
 * @Version 1.0
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProjectParam implements Serializable {
    private Long id;

    private String projectName;

    private String unit;

    private String nature;

    private Long planValue;

    private Date createTime;

    private Date modifyTime;

    private Boolean flag;
}
