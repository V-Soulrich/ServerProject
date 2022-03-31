package com.huarui.dao;

import com.huarui.bean.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author ：Ritchie Shao
 * @date ：Created in 2022/3/14 22:36
 * @description ：
 */
public interface UserDao {
    List<Student> isStudentExist(@Param("phoneNumber") String phoneNumber, @Param("password") String password);//查询学生表

    List<Student> isTeacherExist(@Param("phoneNumber") String phoneNumber, @Param("password") String password);//查询教师表

    int getStudentID(@Param("phoneNumber") String phoneNumber, @Param("password") String password);//获取学生ID

    int getTeacherID(@Param("phoneNumber") String phoneNumber, @Param("password") String password);//获取学生ID

}
