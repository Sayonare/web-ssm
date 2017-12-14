package com.wyz.ssm.service;

import com.wyz.ssm.mapper.UserMapper;
import com.wyz.ssm.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by wyz_Sayonare on 2017/10/24.
 */
@Service()
public class UserServiceImpl implements UserService {

    //User接口
    @Autowired
    private UserMapper userMapper;



    public List<User> findAllUser() throws Exception {

        //调用mapper类中的selectByExample方法，如果传入类型为null,则表示无条件查找
        List<User> users = userMapper.selectByExample(null);
        return  users;

    }
}
