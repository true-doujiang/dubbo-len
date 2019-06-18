/*
Navicat MySQL Data Transfer

Source Server         : 本地数据库
Source Server Version : 50640
Source Host           : localhost:3306
Source Database       : mooc_two

Target Server Type    : MYSQL
Target Server Version : 50640
File Encoding         : 65001

Date: 2019-01-13 17:06:39
*/

SET FOREIGN_KEY_CHECKS=0;

CREATE TABLE `order_record` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `item_id` int(11) NOT NULL  COMMENT '商品id',
  `total` int(11) DEFAULT NULL COMMENT '数量',
  `customer_name` VARCHAR(100) DEFAULT NULL COMMENT '客户名称',
  `is_active` int(11) DEFAULT '1' COMMENT '是否有效（1=是；0=否）',
  `order_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '下单时间',
  `update_time` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT='订单表';
