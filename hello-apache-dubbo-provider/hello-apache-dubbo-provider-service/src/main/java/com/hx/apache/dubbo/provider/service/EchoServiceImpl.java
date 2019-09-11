package com.hx.apache.dubbo.provider.service;

import com.funtl.apache.dubbo.provider.api.EchoService;
import org.apache.dubbo.config.annotation.Service;

/**
 * @author jxlgcmh
 * @date 2019-09-11 19:28
 */
@Service
public class EchoServiceImpl implements EchoService {
    @Override
    public String echo(String string) {
        return "hello nacos and"+string;
    }
}
