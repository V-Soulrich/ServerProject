package com.huarui.dao;

import com.huarui.bean.Student;

import java.util.List;

/**
 * @author ：Ritchie Shao
 * @date ：Created in 2022/3/12 15:41
 * @description ：
 */
public interface StudentDao {
    int insertStudent(Student student);//添加学生

    List<Student> selectStudents(int id);//查询所有学生
}
