package com.lsp.controller;

import com.lsp.util.redis.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lsp
 * @Title: RedisController
 * @ProjectName lsp
 * @Description: TODO
 * @date 2019/3/1 10:45
 */
@RestController
@RequestMapping("/redis")
public class RedisController {

    @Autowired
    private RedisUtil redisUtil;

    @RequestMapping("/set")
    public Object set(){
        boolean b = redisUtil.set("lsp", "casadas", 10);
        long lsp = redisUtil.getExpire("lsp");
        boolean c = redisUtil.set("sad", "casadas");
        return b;
    }
}
