package com.fanhq.example.consumer;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author fanhaiqiu
 * @date 2019/7/15
 */
@RestController
@RequestMapping(value = "open")
public class ConsumerController {

    @RequestMapping("/hi")
    public String hi() {
        return "Hello World";
    }
}
