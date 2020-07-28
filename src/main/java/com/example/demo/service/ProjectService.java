package com.example.demo.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.example.demo.entity.Project;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.demo.model.ProjectParam;

/**
 * Project服务层
 * @author Ray
 * @since 2020-07-26
 */
public interface ProjectService extends IService<Project> {
    /**
     * 新增
     * @author Ray
     * @date 19:53 2020/7/26
     * @return boolean
     **/
    boolean add(ProjectParam projectParam);
    /**
     * 删除
     * @author Ray
     * @date 19:54 2020/7/26
     * @return boolean
     **/
    boolean delete(ProjectParam projectParam);
    /**
     * 更新
     * @author Ray
     * @date 19:55 2020/7/26
     * @return boolean
     **/
    boolean update(ProjectParam projectParam);
    /**
     * 查询单条
     * @author Ray
     * @date 19:55 2020/7/26
     * @return com.example.demo.model.ProjectParam
     **/
    ProjectParam findById(ProjectParam projectParam);
    /**
     * 查询列表
     * @author Ray
     * @date 19:55 2020/7/26
     * @param projectParam 实体参数(条件)
     * @param page 第几页
     * @param limit 每页多少条数据
     * @return java.util.List<com.example.demo.model.ProjectParam>
     **/
    IPage findPage(ProjectParam projectParam, int page, int limit);
}
