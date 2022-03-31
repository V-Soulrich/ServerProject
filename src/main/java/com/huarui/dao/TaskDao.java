package com.huarui.dao;

import com.huarui.bean.Task;

import java.util.List;

/**
 * @author ：Ritchie Shao
 * @date ：Created in 2022/3/17 23:11
 * @description ：随堂测试相关的持久层
 */
public interface TaskDao {

    /*****************************************学生相关的数据库操作***************************************/
    /**
     * 按照学生ID查询该学生拥有的所有随堂测试
     */
    List<Task> getTasksByStuID(int stuID);


    /*****************************************教师相关的数据库操作***************************************/
    /**
     * 按照教师ID查询该教师创建的所有随堂测试
     */
    List<Task> getTasksByTeaID(int teaID);
    /**
     * 根据教师ID向表中新增随堂测试
     */

    /**
     * 根据随堂测试的ID和教师ID删除随堂测试
     */


}
