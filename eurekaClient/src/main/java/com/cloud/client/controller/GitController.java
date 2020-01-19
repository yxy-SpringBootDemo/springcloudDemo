package com.cloud.client.controller;

import com.cloud.client.config.GitAutoRefreshConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yuxy_cyd
 * @version v-1.1.0
 * @Description:TODO(这里用一句话描述这个类的作用)
 * @date: 2020年01月19日 18:23
 **/
@RestController
@RefreshScope
public class GitController {
    @Autowired
    private GitAutoRefreshConfig gitAutoRefreshConfig;

    @GetMapping(value = "autoShow")
    public Object autoShow(){
        return gitAutoRefreshConfig;
    }
}
