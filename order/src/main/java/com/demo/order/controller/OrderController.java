package com.demo.order.controller;

import com.demo.order.feignService.StockFeignSerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/order")
@RefreshScope
public class OrderController {

    @Autowired
    RestTemplate restTemplate;

    @Autowired
    StockFeignSerivce feignSerivce;

    @Value("${author}")
    private String author;

    @RequestMapping("/add")
    public String add(){
        System.out.println("下单成功!");
//        String msg = restTemplate.getForObject("http://stock-server:8011/stock/reduce", String.class);
        String msg = feignSerivce.reduce();
        return author+"Hello World"+msg;
    }
}
