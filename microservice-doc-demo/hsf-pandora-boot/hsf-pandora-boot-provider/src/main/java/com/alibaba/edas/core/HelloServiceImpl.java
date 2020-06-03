package com.alibaba.edas.core;

import com.alibaba.boot.hsf.annotation.HSFProvider;
import com.alibaba.edas.api.HelloService;


@HSFProvider(serviceInterface = HelloService.class)
public class HelloServiceImpl implements HelloService {
    @Override
    public String echo(String string) {
        return string;
    }
}
