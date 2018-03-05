package com.example.sy.springcloud.feign.springcloudfeignservice.service.hystrix;

import com.example.sy.springcloud.feign.springcloudfeignservice.service.SchedualServiceHello;
import org.springframework.stereotype.Component;

@Component
public class SchedualServiceHelloHystrix implements SchedualServiceHello {

    @Override
    public String sayHelloFromClientOne(String name){
        return "sorry "+name;
    }
}
