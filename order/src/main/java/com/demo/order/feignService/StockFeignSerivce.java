package com.demo.order.feignService;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "stock-server", path = "/stock")
public interface StockFeignSerivce {

    @RequestMapping("/reduce")
    public String reduce();
}
