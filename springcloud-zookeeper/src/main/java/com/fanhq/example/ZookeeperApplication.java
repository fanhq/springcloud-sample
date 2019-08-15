package com.fanhq.example;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author fanhaiqiu
 * @date 2019/7/15
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ZookeeperApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(ZookeeperApplication.class).web(WebApplicationType.SERVLET).run(args);
    }
}
