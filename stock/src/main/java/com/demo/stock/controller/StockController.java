package com.demo.stock.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

@RestController
@RequestMapping("/stock")
public class StockController {

    @RequestMapping("/reduce")
    public String reduce() throws InterruptedException {
        TimeUnit.SECONDS.sleep(1);
        System.out.println("扣减库存");
        return "扣减库存";
    }

}
