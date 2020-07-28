package com.example.demo.util;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.bean.copier.CopyOptions;

/**
 * @ClassName ToolUtil
 * @Description //TODO
 * @Author Ray
 * @Date 2020/7/26 20:11
 * @Version 1.0
 **/
public class ToolUtil {
    /**
     * 拷贝属性，为null的不拷贝
     * @author Ray
     * @date 20:12 2020/7/26
     * @param source 源
     * @param target 目标
     **/
    public static void copyProperties(Object source, Object target) {
        BeanUtil.copyProperties(source, target, CopyOptions.create().setIgnoreNullValue(true).ignoreError());
    }
}
