package com.example.demo.response;

import lombok.Data;

/**
 * @ClassName ErrorResponseData
 * @Description //TODO
 * @Author Ray
 * @Date 2020/7/25 22:42
 * @Version 1.0
 **/
@Data
public class ErrorResponseData extends ResponseData {
    /**
     * 异常的具体类名称
     */
    private String exceptionClazz;

    public ErrorResponseData(String message) {
        super(false, ResponseData.DEFAULT_ERROR_CODE, message, null);
    }

    public ErrorResponseData(Integer code, String message) {
        super(false, code, message, null);
    }

    public ErrorResponseData(Integer code, String message, Object object) {
        super(false, code, message, object);
    }
}

