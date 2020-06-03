package com.alibaba.edas;

import com.alibaba.boot.hsf.annotation.HSFConsumer;

import com.alibaba.edas.api.HelloService;
import com.alibaba.edas.api.HsfTestService;
import org.springframework.context.annotation.Configuration;


@Configuration
public class HsfConfig {

    @HSFConsumer(clientTimeout = 3000)
    private HelloService helloService;
    @HSFConsumer(clientTimeout = 3000)
    private HsfTestService hsfTestService;
}
