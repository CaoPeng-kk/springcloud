package com.caop.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author: caopeng
 * @Description:
 * @Date: Created in 11:31 2020/11/5
 */
@EnableEurekaClient
@MapperScan("com.caop.springcloud.mapper")
@SpringBootApplication
public class SpringCloudProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudProviderApplication.class,args);
    }
}
