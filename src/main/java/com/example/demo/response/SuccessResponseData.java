package com.example.demo.response;

/**
 * @ClassName SuccessResponseData
 * @Description //TODO
 * @Author Ray
 * @Date 2020/7/25 22:41
 * @Version 1.0
 **/
public class SuccessResponseData extends ResponseData{
    public SuccessResponseData() {
        super(true, DEFAULT_SUCCESS_CODE, "请求成功", (Object)null);
    }

    public SuccessResponseData(Object object) {
        super(true, DEFAULT_SUCCESS_CODE, "请求成功", object);
    }

    public SuccessResponseData(Integer code, String message, Object object) {
        super(true, code, message, object);
    }
}
