package com.example.demo.controller;


import com.example.demo.entity.Project;
import com.example.demo.model.ProjectParam;
import com.example.demo.response.ResponseData;
import com.example.demo.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 *  前端控制器
 *
 * @author Ray
 * @since 2020-07-26
 */
@RestController
@RequestMapping("project")
public class ProjectController {

    @Autowired
    ProjectService projectService;

    /**
     * 新增接口
     * @author Ray
     * @date 21:04 2020/7/26
     * @return com.example.demo.response.ResponseData
     **/
    @PostMapping("/addItem")
    @ResponseBody
    public ResponseData addItem(@RequestBody ProjectParam projectParam) {
        System.out.println(projectParam);
        if(this.projectService.add(projectParam)) {
            return ResponseData.success();
        } else {
            return ResponseData.error("新增失败！");
        }
    }
    /**
     * 删除接口
     * @author Ray
     * @date 21:06 2020/7/26
     * @return com.example.demo.response.ResponseData
     **/
    @RequestMapping("/delete")
    @ResponseBody
    public ResponseData delete(@RequestBody ProjectParam projectParam) {
        if(this.projectService.delete(projectParam)) {
            return ResponseData.success();
        } else {
            return ResponseData.error("删除失败！");
        }
    }
    /**
     * 编辑接口
     * @author Ray
     * @date 21:07 2020/7/26
     * @return com.example.demo.response.ResponseData
     **/
    @RequestMapping("/editItem")
    @ResponseBody
    public ResponseData editItem(@RequestBody ProjectParam projectParam) {
        if(this.projectService.update(projectParam)) {
            return ResponseData.success();
        } else {
            return ResponseData.error("编辑失败！");
        }
    }
    /**
     * 查看详情接口
     * @author Ray
     * @date 21:08 2020/7/26
     * @return com.example.demo.response.ResponseData
     **/
    @RequestMapping("/detail")
    @ResponseBody
    public ResponseData detail(@RequestBody ProjectParam projectParam) {
        ProjectParam detail = this.projectService.findById(projectParam);
        if(detail!=null){
            return ResponseData.success(detail);
        }else {
            return ResponseData.error("查询失败！");
        }

    }

    /**
     * 查询列表
     * @author Ray
     * @date 21:13 2020/7/26
     * @param projectParam 查询条件
     * @param page 第几页
     * @param limit 每页多少条数据
     * @return com.example.demo.response.ResponseData
     **/
    @ResponseBody
    @RequestMapping("/select")
    public ResponseData list(@RequestBody ProjectParam projectParam, int page, int limit) {
        return ResponseData.success(this.projectService.findPage(projectParam,page,limit));
    }
}
