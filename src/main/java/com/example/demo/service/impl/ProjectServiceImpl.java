package com.example.demo.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.demo.entity.Project;
import com.example.demo.mapper.ProjectMapper;
import com.example.demo.model.ProjectParam;
import com.example.demo.service.ProjectService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.util.ToolUtil;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.util.Date;

/**
 *  服务实现类
 *
 * @author Ray
 * @since 2020-07-26
 */
@Service
public class ProjectServiceImpl extends ServiceImpl<ProjectMapper, Project> implements ProjectService {

    @Transactional(rollbackFor = {RuntimeException.class, Error.class})
    @Override
    public boolean add(ProjectParam projectParam) {
        try {
            projectParam.setCreateTime(new Date());
            projectParam.setModifyTime(new Date());
            projectParam.setFlag(true);
            this.save(getEntity(projectParam));
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }

    @Transactional(rollbackFor = {RuntimeException.class, Error.class})
    @Override
    public boolean delete(ProjectParam projectParam) {
        try {
            projectParam.setModifyTime(new Date());
            projectParam.setFlag(false);
            this.update(projectParam);
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }

    @Transactional(rollbackFor = {RuntimeException.class, Error.class})
    @Override
    public boolean update(ProjectParam projectParam) {
        try {
            projectParam.setModifyTime(new Date());
            Project oldEntity = getOldEntity(projectParam);
            Project newEntity = getEntity(projectParam);
            ToolUtil.copyProperties(newEntity, oldEntity);
            this.updateById(newEntity);
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }

    @Transactional(rollbackFor = {RuntimeException.class, Error.class})
    @Override
    public ProjectParam findById(ProjectParam projectParam) {
        ProjectParam param = null;
        try {
            Project entity = this.getById(getKey(projectParam));
            param = new ProjectParam();
            ToolUtil.copyProperties(entity, param);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return param;
    }

    @Transactional(rollbackFor = {RuntimeException.class, Error.class})
    @Override
    public IPage findPage(ProjectParam projectParam, int page, int limit) {
        return this.baseMapper.selectPage(new Page(page, limit), projectParam);
    }

    private Serializable getKey(ProjectParam param){
        return param.getId();
    }

    private Project getOldEntity(ProjectParam param) {
        return this.getById(getKey(param));
    }

    private Project getEntity(ProjectParam param) {
        Project entity = new Project();
        ToolUtil.copyProperties(param, entity);
        return entity;
    }

}
