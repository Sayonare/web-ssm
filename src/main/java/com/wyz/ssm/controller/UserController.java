package com.wyz.ssm.controller;

import com.wyz.ssm.pojo.User;
import com.wyz.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by wyz_Sayonare on 2017/10/24.
 */
@Controller
public class UserController {

    //service类
    @Autowired
    private UserService userService;



    /**
     *
     * 查找所有用户控制器方法
     * @return
     * @throwsEception
     * */

    @RequestMapping("/findUser")
    public String findAll(Model model)throws Exception
    {


         //调用service方法得到用户列表
        List<User> users = userService.findAllUser();
        //将得到的用户列表添加到modelAndView中
       model.addAttribute("users",users);
        return "/findUser";

    }
}
