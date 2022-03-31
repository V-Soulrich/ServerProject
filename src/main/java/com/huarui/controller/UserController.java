package com.huarui.controller;

import com.alibaba.fastjson.JSONObject;
import com.huarui.bean.User;
import com.huarui.service.UserService;
import com.huarui.utils.IOUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author ：Ritchie Shao
 * @date ：Created in 2022/3/14 22:32
 * @description ：
 */
@Controller//创建处理器对象，对象放在SpringMVC容器中
@RequestMapping("/user")
public class UserController {
    @Resource//自动注入
    private UserService service;

    /**
     * 功能：检查数据库里是否存在该用户
     * 传入：用户输入的手机号和密码
     * 传出：检查结果 status_exist(true/false)
     */
    @RequestMapping("/isUserExist.do")
    public void queryStudent(HttpServletRequest request, HttpServletResponse response) {
        //判断用户登录是否合法
        User user = new User ();
        user.setPhoneNumber (request.getParameter ("phoneNumber"));
        user.setPassword (request.getParameter ("password"));
        user.setUserRole (request.getParameter ("userRole"));
        System.out.println (user.getPhoneNumber ());
        //参数检查，简单的数据处理
        boolean flag = service.checkUserExist (user);//查询结果
        JSONObject json = new JSONObject ();
        try {
            json.put ("status_exist", String.valueOf (flag));
            if (flag) {
                int id = service.getUserID (user);
                json.put ("id", id);
            }
        } catch (Exception e) {
            e.printStackTrace ();
        }
        IOUtil.returnResponse (response, json);
    }
}
