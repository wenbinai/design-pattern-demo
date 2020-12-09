package edu.nefu.impl;

import edu.nefu.OrderAdapterService;
import edu.nefu.service.OrderService;

public class InsideOrderService implements OrderAdapterService {
    private OrderService orderService = new OrderService();

    @Override
    public boolean isFirst(String uId) {
        return orderService.queryUserOrderCount(uId) <= 1;
    }
}
