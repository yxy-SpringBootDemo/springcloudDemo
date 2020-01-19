package com.cloud.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

/**
 * @author yuxy_cyd
 * @version v-1.1.0
 * @Description:TODO(这里用一句话描述这个类的作用)
 * @date: 2020年01月03日 14:35
 **/
/*
@RestController
@RequestMapping("/getInfo")
public class Controller {

    @Value("${server.port}")
    String port;
    @Value("${spring.application.name}")
    String serviceName;

    @RequestMapping("/show")
    public String getInfo(){
        return "I'm form service:"+serviceName+",port:"+port;
    }

    @RequestMapping(value = "no/{no}", method = RequestMethod.GET)
    public String getPolicyFileByPolicyNo(@PathVariable String no, HttpServletResponse httpServletResponse){

        try {
            String  result = "I'm form service:"+serviceName+",port:"+port;
            if (result == null){
                httpServletResponse.setStatus(HttpServletResponse.SC_NOT_FOUND);
                return null;
            } else
                return result;
        } catch (Exception e) {
            e.printStackTrace();
            httpServletResponse.setStatus(HttpServletResponse.SC_BAD_REQUEST);
            return e.getMessage();
        }
    }

    @RequestMapping("/port")
    public String findInfo(){
        return "I'm form service:"+serviceName+",port:"+port;
    }
}
*/
