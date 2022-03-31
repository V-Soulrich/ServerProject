package com.huarui.service.impl;

import com.huarui.bean.Student;
import com.huarui.bean.User;
import com.huarui.dao.UserDao;
import com.huarui.service.UserService;
import com.huarui.utils.Constant;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @author ：Ritchie Shao
 * @date ：Created in 2022/3/14 22:35
 * @description ：
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;

    //检查用户是否存在
    @Override
    public boolean checkUserExist(User user) {
        //根据手机号和密码查询数据库，有没有该用户存在
        List<Student> list = new ArrayList<> ();
        if (user.getUserRole ().equals (Constant.RoleStudent)) {
            //当用户角色是学生时
            list.clear ();
            list.addAll (userDao.isStudentExist (user.getPhoneNumber (), user.getPassword ()));
        }
        if (user.getUserRole ().equals (Constant.RoleTeacher)) {
            //当用户角色是教师时
            list.clear ();
            list.addAll (userDao.isTeacherExist (user.getPhoneNumber (), user.getPassword ()));
        }
        return list.size () > 0 ? true : false;
    }

    @Override
    public int getUserID(User user) {
        int id = 0;
        if (user.getUserRole ().equals (Constant.RoleStudent)) {
            id = userDao.getStudentID (user.getPhoneNumber (), user.getPassword ());
        }
        if (user.getUserRole ().equals (Constant.RoleTeacher)) {
            id = userDao.getTeacherID (user.getPhoneNumber (), user.getPassword ());
        }
        return id;
    }
}
