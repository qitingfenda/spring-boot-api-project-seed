package com.company.project.core;

import com.alibaba.fastjson.JSON;
import lombok.Getter;

/**
 * 统一API响应结果封装
 *
 * @author yhc
 * @date 2020/3/26 10:00
 */
@Getter
public class Result<T> {
    private int code;
    private String message;
    private T data;

    public Result setCode(ResultCode resultCode) {
        this.code = resultCode.code();
        return this;
    }

    public Result setMessage(String message) {
        this.message = message;
        return this;
    }

    public Result setData(T data) {
        this.data = data;
        return this;
    }

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
