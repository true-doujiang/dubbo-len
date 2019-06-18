package com.debug.mooc.dubbo.one.api.enums;
/**
 * Created by Administrator on 2019/1/12.
 */

import lombok.Getter;
import lombok.Setter;

/**
 * @Author:debug (SteadyJack)
 * @Date: 2019/1/12 14:01
 **/
@Getter
public enum StatusCode {

    Success(0, "成功"),
    Fail(-1, "失败"),
    InvalidParams(200, "无效的参数"),
    ItemNotExist(201, "商品不存在!");

    private Integer code;
    private String msg;

    StatusCode(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

}





















