package com.fanhq.example.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author fanhaiqiu
 * @date 2019/7/15
 */

@Component
@FeignClient(value="server")
public interface OpenClient {

    @RequestMapping(value = "/show")
    public String hi();
}
