package com.fanhq.example.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.cloud.client.serviceregistry.AbstractAutoServiceRegistration;
import org.springframework.stereotype.Component;

/**
 * @author fanhaiqiu
 * @date 2019/8/15
 */
@Component
public class CloudConfiguration implements ApplicationRunner {

    @Autowired
    private AbstractAutoServiceRegistration serviceRegistration;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        serviceRegistration.start();
    }
}
