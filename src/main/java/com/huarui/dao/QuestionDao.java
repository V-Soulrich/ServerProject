package com.huarui.dao;

import com.huarui.bean.Question;

import java.util.List;

/**
 * @author ：Ritchie Shao
 * @date ：Created in 2022/3/18 19:43
 * @description ：
 */
public interface QuestionDao {

    Question getQuestionByQuesID(int quesID);//根据题目ID获取题目内容

    List<Question> getQuestionsByTaskID(int taskID);//根据随堂测试ID查询包含题目的ID

}
