package com.wyz.ssm.controller;

import com.wyz.ssm.pojo.Orders;
import com.wyz.ssm.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by wyz_Sayonare on 2017/10/26.
 */
@Controller
public class OdersController {


    @Autowired
    private OrdersService ordersService;

    @RequestMapping("/findOrder")
    public String findAllOrdersList(Model model)throws Exception
    {
            List<Orders> orders= ordersService.findAllOrders();
            model.addAttribute("orders",orders);
            return "/findOrder";
    }
}
