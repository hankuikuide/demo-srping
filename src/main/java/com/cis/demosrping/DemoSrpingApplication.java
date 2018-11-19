package com.cis.demosrping;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
@MapperScan("com.cis.demosrping.mapper")
public class DemoSrpingApplication {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(){
        return "Hello Sping Boot";
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoSrpingApplication.class, args);
    }
}
