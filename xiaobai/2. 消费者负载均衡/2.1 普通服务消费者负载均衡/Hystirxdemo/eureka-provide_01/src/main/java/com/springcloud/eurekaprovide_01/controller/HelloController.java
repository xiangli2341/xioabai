package com.springcloud.eurekaprovide_01.controller;

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
        System.out.println(services);
        return services;
    }
}
