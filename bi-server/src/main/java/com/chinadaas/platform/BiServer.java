package com.chinadaas.platform;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * Created by xie on 16/7/25.
 */
@SpringBootApplication
@EnableFeignClients
@EnableEurekaClient
public class BiServer {

    public static void main(String[] args) {
        SpringApplication.run(BiServer.class, args);
    }
}
