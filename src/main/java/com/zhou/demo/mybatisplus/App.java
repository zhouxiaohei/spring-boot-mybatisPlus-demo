package com.zhou.demo.mybatisplus;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @ClassName App
 * @Description
 * @Author JackZhou
 * @Date 2019/5/6  9:49
 **/
@SpringBootApplication
@EnableSwagger2
@MapperScan("com.zhou.demo.mybatisplus.dao.mapper")
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
