package com.study.koreasleeptechservlet.order_app.dao.impl;

import com.study.koreasleeptechservlet.order_app.dao.OrderDao;
import com.study.koreasleeptechservlet.order_app.entity.Order;

import java.util.List;

public class OrderDaoImpl implements OrderDao {
    @Override
    public boolean save(Order order) {
        return false;
    }

    @Override
    public List<Order> findByUserId(int userId) {
        return List.of();
    }
}
