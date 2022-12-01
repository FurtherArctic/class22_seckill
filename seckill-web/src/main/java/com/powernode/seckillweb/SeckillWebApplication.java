package com.powernode.seckillweb;

import com.github.xiaoymin.swaggerbootstrapui.annotations.EnableSwaggerBootstrapUI;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author wangjunchen
 */
@EnableSwagger2
@EnableSwaggerBootstrapUI
@SpringBootApplication
public class SeckillWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(SeckillWebApplication.class, args);
    }

}
