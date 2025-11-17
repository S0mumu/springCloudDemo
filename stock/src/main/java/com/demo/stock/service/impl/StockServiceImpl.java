package com.demo.stock.service.impl;

import com.demo.stock.mapper.StockMapper;
import com.demo.stock.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StockServiceImpl implements StockService {
    @Autowired
    StockMapper stockMapper;

    public void reduce(Integer productId) {
        System.out.println("更新商品:"+productId);
        stockMapper.reduce(productId);
    }
}
