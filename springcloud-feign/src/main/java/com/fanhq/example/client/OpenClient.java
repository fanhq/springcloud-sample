package com.fanhq.example.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author fanhaiqiu
 * @date 2019/7/15
 */

@Component
@FeignClient(value = "hi-service", path = "open")
public interface OpenClient {

    @RequestMapping(path = "hi")
    public String hi();
}
