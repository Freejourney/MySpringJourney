package com.ddw.MySpringJourney.repository;

import com.ddw.MySpringJourney.bean.Order;

public interface OrderRepository {

    Order save(Order order);
}
