package com.springcloud.eurekaprovide_02.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author RLY
 */
@RestController
public class HelloController {
    @Autowired
    DiscoveryClient discoveryClient;

    @RequestMapping("/dc")
    public String dc(){
        String services = "Services" + discoveryClient.getServices();
        System.out.print("2222222222\t");
        System.out.println(services);
        return services;
    }
}
