package com.wyz.ssm.service;

import com.wyz.ssm.pojo.User;

import java.util.List;


/**
 * Created by wyz_Sayonare on 2017/10/24.
 */
public interface UserService {

    /**
     * 查找所有用户
     * @return
     * @throws Exception
     *
     * */

    List<User> findAllUser() throws Exception;
}
