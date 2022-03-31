package com.huarui.service.impl;

import com.huarui.bean.Student;
import com.huarui.dao.StudentDao;
import com.huarui.service.StudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author ：Ritchie Shao
 * @date ：Created in 2022/3/12 16:16
 * @description ：
 */
@Service
public class StudentServiceImpl implements StudentService {
    //引用类型的自动注入
    @Resource
    private StudentDao studentDao;

    @Override
    public int addStudent(Student student) {
        int nums = studentDao.insertStudent (student);
        return nums;
    }

    @Override
    public List<Student> findStudents() {
        return studentDao.selectStudents (1);
    }
}
