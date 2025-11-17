package com.demo.order.service.impl;

import com.demo.order.feignService.StockFeignService;
import com.demo.order.mapper.OrderMapper;
import com.demo.order.pojo.Order;
import com.demo.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.TimeUnit;

@Service
public class OrderServiceImpl implements OrderService {


    @Autowired
    OrderMapper orderMapper;

    @Autowired
    StockFeignService stockService;

    /**
     * 下单
     * @return
     */
    @Override
    public Order create(Order order) {
        // 插入能否成功？
        orderMapper.insert(order);

        // 扣减库存 能否成功？
        stockService.reduce(order.getProductId());

        // 异常
//        int a=1/0;

        return order;
    }

    @Override
    public List<Order> all() throws InterruptedException {
        TimeUnit.SECONDS.sleep(2);
        return orderMapper.selectAll();
    }

    @Override
    public Order get(Integer id) {
        return orderMapper.selectByPrimaryKey(id);
    }
}

