package com.cn.family;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletComponentScan;

/**
 * SpringBoot启动类 . <br> 继承SpringBootServletInitializer类并重写configure方法 <br> 打包成war包的形式 <br>
 * ServletComponentScan表示开启servlet的注解 <br>
 *
 * @author hkb <br>
 */
@SpringBootApplication
@ServletComponentScan
@MapperScan("com.cn.family.dao")
public class WebApplication {

    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(WebApplication.class);
    }


    public static void main(String[] args) {
        SpringApplication.run(WebApplication.class, args);
    }
}
