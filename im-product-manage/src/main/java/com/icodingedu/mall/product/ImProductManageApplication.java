package com.icodingedu.mall.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("com.icodingedu.mall.product.mapper")
public class ImProductManageApplication {

    public static void main(String[] args) {
        SpringApplication.run(ImProductManageApplication.class, args);
    }

}
