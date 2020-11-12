package com.caop.springcloud.controller;

import com.caop.springcloud.pojo.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @Author: caopeng
 * @Description:
 * @Date: Created in 11:15 2020/11/9
 */
@RestController
public class ConsumerController {

    @Autowired
    RestTemplate restTemplate;

    //此url要对应具体服务下的requestmapping的url
    public static final String URL = "http://Spring-Cloud-demo/select";

    @RequestMapping("/query")
    public String select() {
        String dept = restTemplate.getForObject(URL, String.class);
        return dept;
    }
}
