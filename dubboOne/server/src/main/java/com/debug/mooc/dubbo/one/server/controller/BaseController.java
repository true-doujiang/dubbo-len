package com.debug.mooc.dubbo.one.server.controller;/**
 * Created by Administrator on 2019/1/12.
 */

import com.debug.mooc.dubbo.one.api.enums.StatusCode;
import com.debug.mooc.dubbo.one.api.response.BaseResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author:debug (SteadyJack)
 * @Date: 2019/1/12 14:02
 **/
@RestController
public class BaseController {

    private static final Logger log= LoggerFactory.getLogger(BaseController.class);

    private static final String prefix="base";

    /**
     * 测试的hello world
     * @param param
     * @return
     */
    @RequestMapping(value = prefix+"/one",method = RequestMethod.GET)
    public BaseResponse one(@RequestParam String param){
        BaseResponse response=new BaseResponse(StatusCode.Success);
        try {
            response.setData(param);

        }catch (Exception e){
            e.printStackTrace();
            response=new BaseResponse(StatusCode.Fail);
        }
        return response;
    }

}


























