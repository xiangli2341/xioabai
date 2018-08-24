package com.springcloud.eurekaprovide_01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;



/**
 * @author RLY
 *
 * 提供者_01
 */
@EnableDiscoveryClient
@SpringBootApplication
public class EurekaProvide01Application {

    public static void main(String[] args) {
        SpringApplication.run(EurekaProvide01Application.class, args);
    }
}
