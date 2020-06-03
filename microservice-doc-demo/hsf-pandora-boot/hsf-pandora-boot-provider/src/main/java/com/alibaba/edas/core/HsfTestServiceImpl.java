package com.alibaba.edas.core;

import com.alibaba.boot.hsf.annotation.HSFProvider;
import com.alibaba.edas.api.HsfTestService;

@HSFProvider(serviceInterface= HsfTestService.class)
public class HsfTestServiceImpl implements HsfTestService{
    @Override
    public String echo(){
        return "success";
    }
}
