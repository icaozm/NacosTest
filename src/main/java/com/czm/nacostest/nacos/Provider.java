package com.czm.nacostest.nacos;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: caozm
 * @create: 2023-03-02 22:22
 * @Version 1.0
 * @description:
 **/
@RestController
public class Provider {

    @Value("${server.port}")
    private String port;

    @GetMapping("/hello/t")
    public String test() {
        return "caozm" + port;
    }

}