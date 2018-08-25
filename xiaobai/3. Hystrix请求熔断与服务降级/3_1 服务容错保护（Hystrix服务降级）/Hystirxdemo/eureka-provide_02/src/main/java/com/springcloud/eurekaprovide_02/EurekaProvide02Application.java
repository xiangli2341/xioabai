package com.springcloud.eurekaprovide_02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


/**
 * @author RLY
 */
@EnableDiscoveryClient
@SpringBootApplication
public class EurekaProvide02Application {

    public static void main(String[] args) {
        SpringApplication.run(EurekaProvide02Application.class, args);
    }
}
