package com.mooc.springboot.dubbo.provider.quickstart;



import com.mooc.springboot.dubbo.ServiceAPI;
import org.apache.dubbo.config.annotation.DubboService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;
@Component
@DubboService(version = "1.0.0",group = "test")
public class QuickstartServiceImpl  implements ServiceAPI {

    @Override
    public String sendMessage(String message) {

        return "quickstart-provider-message"+message;
    }
}
