package com.iotek.service;

import com.iotek.po.OrderList;

/**
 * Created by 15311 on 2017/12/17.
 */
public interface OrderListService extends BaseService<OrderList>{
    OrderList queryOrderListById(Long id);
}
