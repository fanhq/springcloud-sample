package com.fanhq.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Configuration;

/**
 * @author fanhaiqiu
 * @date 2019/7/15
 */
@Configuration
@EnableAutoConfiguration
@EnableDiscoveryClient
public class ZookeeperApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZookeeperApplication.class, args);
    }
}
