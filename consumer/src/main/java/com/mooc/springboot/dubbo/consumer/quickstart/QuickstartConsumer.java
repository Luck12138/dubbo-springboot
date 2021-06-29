package com.mooc.springboot.dubbo.consumer.quickstart;


import com.mooc.springboot.dubbo.ServiceAPI;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Component;

@Component
public class QuickstartConsumer {

    @DubboReference(version="1.0.0" , group="test")

    ServiceAPI serviceAPI;

    public void sendMessage(String message){
        System.out.println(serviceAPI.sendMessage(message ));
    }


}
