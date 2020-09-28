package com.cloud.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author dongchang.xu
 * @date 2020/9/28 11:04
 */

@RestController
@RefreshScope
public class TestController {

    @Value("${test.name}")
    private String name;

    @GetMapping("/get")
    public String getName(){
        return name;
    }
}
