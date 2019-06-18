package com.debug.mooc.dubbo.one.api.service;

/**
 * Created by Administrator on 2019/1/13.
 */
import com.debug.mooc.dubbo.one.api.response.BaseResponse;

/**
 * @Author:debug (SteadyJack)
 * @Date: 2019/1/13 14:20
 **/
public interface IDubboItemService {

    //这里名字改一下  不重新install 消费方不知道试试
    BaseResponse listItems();

    BaseResponse listPageItems(Integer pageNo, Integer pageSize);

    BaseResponse listPageItemsParams(Integer pageNo, Integer pageSize, String search);

}