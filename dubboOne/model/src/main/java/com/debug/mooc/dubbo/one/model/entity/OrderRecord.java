package com.debug.mooc.dubbo.one.model.entity;

import lombok.Data;
import lombok.ToString;

import java.util.Date;


/**
 * 不实现 Serializable 试试
 */
@Data
@ToString
public class OrderRecord {

    private Integer id;

    private Integer itemId;

    private Integer total;

    private String customerName;

    private Date orderTime;

    private Integer isActive;

    private Date updateTime;

}