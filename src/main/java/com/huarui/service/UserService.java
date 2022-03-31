package com.huarui.service;

import com.huarui.bean.User;

/**
 * @author ：Ritchie Shao
 * @date ：Created in 2022/3/14 22:34
 * @description ：
 */
public interface UserService {
    boolean checkUserExist(User user);//根据手机号和密码查询用户是否存在

    int getUserID(User user);//根据手机号和密码查询用户ID

}
