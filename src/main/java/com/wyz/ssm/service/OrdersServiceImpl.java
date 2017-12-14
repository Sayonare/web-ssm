package com.wyz.ssm.service;

import com.wyz.ssm.mapper.OrdersMapper;
import com.wyz.ssm.mapper.UserMapper;
import com.wyz.ssm.pojo.Orders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by wyz_Sayonare on 2017/10/26.
 */
@Service()
public class OrdersServiceImpl implements  OrdersService{

    @Autowired
    private OrdersMapper ordersMapper;

    public List<Orders> findAllOrders() throws Exception {

        //调用mapper类中的selectByExample方法，如果传入类型为null,则表示无条件查找
        List<Orders> ordersList = ordersMapper.selectByExample(null);

        return ordersList;
    }
}
