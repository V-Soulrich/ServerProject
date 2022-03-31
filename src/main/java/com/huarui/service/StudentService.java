package com.huarui.service;

import com.huarui.bean.Student;

import java.util.List;

/**
 * @author ：Ritchie Shao
 * @date ：Created in 2022/3/12 16:14
 * @description ：用来调用dao
 */
public interface StudentService {
    int addStudent(Student student);

    List<Student> findStudents();
}
