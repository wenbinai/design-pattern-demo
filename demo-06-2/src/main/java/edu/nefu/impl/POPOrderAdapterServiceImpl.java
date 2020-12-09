package edu.nefu.impl;

import edu.nefu.OrderAdapterService;
import edu.nefu.service.POPOrderService;

public class POPOrderAdapterServiceImpl implements OrderAdapterService {
    private POPOrderService popOrderService = new POPOrderService();

    @Override
    public boolean isFirst(String uId) {
        return popOrderService.isFirstOrder(uId);
    }
}
