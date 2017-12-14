package com.wyz.ssm.service;

import com.wyz.ssm.pojo.Orders;

import java.util.List;

/**
 * Created by wyz_Sayonare on 2017/10/26.
 */
public interface OrdersService {

    /**
     * 查找所有订单
     * @return
     * @throws Exception
     *
     * */

    List<Orders> findAllOrders()throws Exception;
}
