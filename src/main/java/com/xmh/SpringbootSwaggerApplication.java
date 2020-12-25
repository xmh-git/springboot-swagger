package com.xmh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * 描述: 启动类
 *
 * @author xmh
 * @date 2020/12/25 16:52
 */
@SpringBootApplication
@ComponentScan({"com.xmh.common"})
public class SpringbootSwaggerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootSwaggerApplication.class, args);
    }

}
