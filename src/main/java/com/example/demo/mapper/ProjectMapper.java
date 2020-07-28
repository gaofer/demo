package com.example.demo.mapper;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.demo.entity.Project;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo.model.ProjectParam;

/**
 *  ProjectMapper 接口
 *
 * @author Ray
 * @since 2020-07-26
 */
public interface ProjectMapper extends BaseMapper<Project> {
    IPage<Project> selectPage(Page<Project> page, ProjectParam projectParam);
}
