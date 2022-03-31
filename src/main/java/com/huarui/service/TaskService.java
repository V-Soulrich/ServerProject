package com.huarui.service;

import com.huarui.bean.Task;

import java.util.List;

/**
 * @author ：Ritchie Shao
 * @date ：Created in 2022/3/17 23:11
 * @description ：
 */
public interface TaskService {

    List<Task> getTasksByStuID(int stuID);//根据学生ID获取该学生拥有的随堂测试列表

    List<Task> getTasksByTeaID(int teaID);//根据教师ID获取该教师拥有的随堂测试列表
}
