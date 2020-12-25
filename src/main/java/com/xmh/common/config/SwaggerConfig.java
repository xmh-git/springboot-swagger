package com.xmh.common.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * 描述：swagger配置类
 *
 * @author xuminghao
 * @date 2020/12/25 16:47
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket customDocket() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.xmh.integrate.controller"))
                .build();
    }

    public ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("swagger标题")
                .description("swagger描述")
                .version("版本号")
                .build();
    }
}
