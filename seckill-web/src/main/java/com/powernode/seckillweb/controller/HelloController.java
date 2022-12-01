package com.powernode.seckillweb.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangjunchen
 */
@Api(tags = "Hello测试用")
@RestController
public class HelloController {
    @RequestMapping("/hello")
    @ApiOperation(value = "HelloController", notes = "hello controller，用来测试swagger是否可用")
    public String hello() {
        return "Hello";
    }
}
