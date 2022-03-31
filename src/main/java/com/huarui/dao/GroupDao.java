package com.huarui.dao;

import com.huarui.bean.Group;

import java.util.List;

/**
 * @author ：Ritchie Shao
 * @date ：Created in 2022/3/16 15:50
 * @description ：
 */
public interface GroupDao {
    List<Group> getGroupsByStuID(int stuID);//按照学生id查询该学生所加入的所以班级，列表

    List<Group> getGroupsByTeaID(int teaID);//按照教师id查询该教师所加入的所以班级，列表
}
