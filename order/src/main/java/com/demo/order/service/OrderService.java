package com.demo.order.service;

import com.demo.order.pojo.Order;

import java.util.List;

public interface OrderService {

    Order create(Order order);

    List<Order> all() throws InterruptedException;

    Order get(Integer id);
}

