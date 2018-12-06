package com.zxs.mine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@tk.mybatis.spring.annotation.MapperScan(basePackages = "com.zxs.mine.infra.mapper")
@SpringBootApplication
public class MineApplication {

    public static void main(String[] args) {
        SpringApplication.run(MineApplication.class, args);
    }
}
