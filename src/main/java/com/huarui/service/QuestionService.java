package com.huarui.service;

import com.huarui.bean.Question;

import java.util.List;

/**
 * @author ：Ritchie Shao
 * @date ：Created in 2022/3/18 19:55
 * @description ：
 */
public interface QuestionService {
    Question getQuestionByQuesID(int quesID);//根据题目ID获取题目内容

    List<Question> getQuestionsByTaskID(int taskID);
}
