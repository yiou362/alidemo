package com.alibaba.edas;

import com.alibaba.edas.api.HelloService;
import com.alibaba.edas.api.HsfTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class SimpleController {


    @Autowired
    private HelloService helloService;
    @Autowired
    private HsfTestService hsfTestService;

    @RequestMapping(value = "/hsf-echo/{str}", method = RequestMethod.GET)
    public String echo(@PathVariable String str) {
        return helloService.echo(str);
    }

    @RequestMapping(value = "/hsf-echo", method = RequestMethod.GET)
    public String echo(){
        return hsfTestService.echo();
    }
}
