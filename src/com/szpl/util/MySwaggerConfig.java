package com.szpl.util;

import com.mangofactory.swagger.configuration.SpringSwaggerConfig;
import com.mangofactory.swagger.models.dto.ApiInfo;
import com.mangofactory.swagger.paths.SwaggerPathProvider;
import com.mangofactory.swagger.plugin.EnableSwagger;
import com.mangofactory.swagger.plugin.SwaggerSpringMvcPlugin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Created by litao on 2018/1/4.
 */
@Configuration
@EnableSwagger
@EnableWebMvc
@ComponentScan(basePackages="com.szpl.controller")
public class MySwaggerConfig {
    private SpringSwaggerConfig springSwaggerConfig;

    /**
     * Required to autowire SpringSwaggerConfig
     */
    @Autowired
    public void setSpringSwaggerConfig(SpringSwaggerConfig springSwaggerConfig) {
        this.springSwaggerConfig = springSwaggerConfig;
    }

    /**
     * Every SwaggerSpringMvcPlugin bean is picked up by the swagger-mvc
     * framework - allowing for multiple swagger groups i.e. same code base
     * multiple swagger resource listings.
     */
    @Bean
    public SwaggerSpringMvcPlugin customImplementation() {
        // 暂时不用过滤
//        return new SwaggerSpringMvcPlugin(this.springSwaggerConfig).
//                apiInfo(apiInfo()).includePatterns(".*.*").
//               pathProvider(new GetPaths());
        return new SwaggerSpringMvcPlugin(this.springSwaggerConfig).apiInfo(apiInfo());
    }

    private ApiInfo apiInfo() {
        ApiInfo apiInfo = new ApiInfo(
                "系统API接口测试平台",
                "提供后台所有REST接口测试",
                "My Apps API terms of service",
                "18720087030@163.com",
                "license@1.0",
                "www.baidu.com"
        );
        return apiInfo;
    }
    class GetPaths extends SwaggerPathProvider {
        @Override
        protected String applicationPath() {
            return "/api";
        }

        @Override
        protected String getDocumentationPath() {
            return "/swaggerApi";
        }
    }
}
