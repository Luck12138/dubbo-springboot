package com.mooc.springboot.dubbo.consumer;


import com.mooc.springboot.dubbo.consumer.quickstart.QuickstartConsumer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication

public class ConsumerApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(ConsumerApplication.class, args);
        QuickstartConsumer quickstartConsumer = (QuickstartConsumer) run.getBean("quickstartConsumer");
        quickstartConsumer.sendMessage("1111");

    }

}

