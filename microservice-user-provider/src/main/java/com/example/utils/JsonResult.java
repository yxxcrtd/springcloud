package com.example.utils;

import lombok.Data;

@Data
public class JsonResult<T> {

    private int code;

    private String message;

    private T data;

    public static final <T> JsonResult<T> jsonResultSuccess(String message, T t) {
        JsonResult<T> jsonResult = new JsonResult<T>();
        jsonResult.setCode(200);
        jsonResult.setMessage(message);
        jsonResult.setData(t);
        return jsonResult;
    }

    public static final <T> JsonResult<T> jsonResultFail(String message) {
        JsonResult<T> jsonResult = new JsonResult<T>();
        jsonResult.setCode(-200);
        jsonResult.setMessage(message);
        return jsonResult;
    }

}
