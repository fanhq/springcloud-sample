package com.fanhq.example.consumer;

import com.fanhq.example.client.OpenClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author fanhaiqiu
 * @date 2019/7/15
 */
@RestController
@RequestMapping(value = "consume")
public class ConsumeController {

    @Autowired
    private OpenClient openClient;

    @RequestMapping("/hi")
    public String hi() {
        return openClient.hi();
    }
}
