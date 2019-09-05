package com.fanhq.example.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author fanhaiqiu
 * @date 2019/7/15
 */

@Component
@FeignClient(value = "hi-service", path = "open")
public interface OpenClient {

    @GetMapping(path = "hi")
    public String hi();
}
