package com.czm.nacostest.nacos;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author: caozm
 * @create: 2023-03-01 23:33
 * @Version 1.0
 * @description:
 **/
@RestController
@RefreshScope
public class NacosTest {

    @Value("${czm.user_name}")
    private String userName;

    @Value("${test.timeout}")
    private String timeOut;

    @GetMapping("/user")
    public String test() {
        System.out.println(userName);
        return userName + "-----" + timeOut;
    }
}