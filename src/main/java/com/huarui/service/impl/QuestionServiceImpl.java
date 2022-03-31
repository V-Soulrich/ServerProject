package com.huarui.service.impl;

import com.huarui.bean.Question;
import com.huarui.dao.QuestionDao;
import com.huarui.service.QuestionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author ：Ritchie Shao
 * @date ：Created in 2022/3/18 19:56
 * @description ：
 */
@Service
public class QuestionServiceImpl implements QuestionService {

    @Resource
    private QuestionDao questionDao;

    @Override
    public Question getQuestionByQuesID(int quesID) {
        Question question = questionDao.getQuestionByQuesID (quesID);
        return question;
    }

    @Override
    public List<Question> getQuestionsByTaskID(int taskID) {
        List<Question> list = questionDao.getQuestionsByTaskID (taskID);
        return list;
    }


}
