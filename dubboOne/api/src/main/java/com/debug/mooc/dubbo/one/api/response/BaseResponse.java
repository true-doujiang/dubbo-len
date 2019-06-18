package com.debug.mooc.dubbo.one.api.response;/**
 * Created by Administrator on 2019/1/12.
 */

import com.debug.mooc.dubbo.one.api.enums.StatusCode;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * @Author:debug (SteadyJack)
 * @Date: 2019/1/12 13:59
 *
 * 不实现 Serializable 试试
 **/
@Getter
@Setter
public class BaseResponse<T> implements Serializable {

    private Integer code;
    private String msg;
    private T data;

    public BaseResponse() {
    }

    public BaseResponse(Integer code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public BaseResponse(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public BaseResponse(StatusCode statusCode) {
        this.code = statusCode.getCode();
        this.msg = statusCode.getMsg();
    }
}


























