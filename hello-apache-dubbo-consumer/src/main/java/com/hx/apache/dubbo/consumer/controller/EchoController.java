package com.hx.apache.dubbo.consumer.controller;

import com.funtl.apache.dubbo.provider.api.EchoService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jxlgcmh
 * @date 2019-09-11 19:38
 */
@RefreshScope
@RestController
public class EchoController {

    @Value("${user.name}")
    private String username;
    /*这个注解必须是对的，否则无法注册成功*/
    @Reference
    private EchoService echoService;

    @GetMapping(value = "/echo/{string}")
    public String echo(@PathVariable String string) {
        return echoService.echo(string+"/t"+username);
    }
}
