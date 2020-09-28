package com.cloud.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigApplication.class, args);

//        ConfigurableApplicationContext applicationContext = SpringApplication.run(ConfigApplication.class, args);
//        String userName = applicationContext.getEnvironment().getProperty("test.name");
//        System.err.println("user name :" + userName);
    }

}



