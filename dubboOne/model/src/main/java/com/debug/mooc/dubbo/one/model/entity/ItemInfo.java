package com.debug.mooc.dubbo.one.model.entity;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 不实现 Serializable 试试
 */
@Data
@ToString
public class ItemInfo implements Serializable {

    private Integer id;

    private String code;

    private String name;

    private BigDecimal price;

    private Integer isActive;

    private Date createTime;

    private Date updateTime;


}