package com.fanhq.example.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.zookeeper.serviceregistry.ServiceInstanceRegistration;
import org.springframework.cloud.zookeeper.serviceregistry.ZookeeperRegistration;
import org.springframework.cloud.zookeeper.serviceregistry.ZookeeperServiceRegistry;
import org.springframework.context.annotation.Configuration;

/**
 * @author fanhaiqiu
 * @date 2019/8/15
 */
@Configuration
public class ZookeeperRegistrationConfig {

    @Autowired
    private ZookeeperServiceRegistry serviceRegistry;

    public void registerThings() {
        ZookeeperRegistration registration = ServiceInstanceRegistration.builder()
                .defaultUriSpec()
                .address("127.0.0.1")
                .port(8081)
                .name("service")
                .build();
        this.serviceRegistry.register(registration);
    }
}
