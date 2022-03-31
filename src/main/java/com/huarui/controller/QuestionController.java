package com.huarui.controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.huarui.bean.Question;
import com.huarui.service.QuestionService;
import com.huarui.utils.IOUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * @author ：Ritchie Shao
 * @date ：Created in 2022/3/18 19:43
 * @description ：
 */
@Controller//创建处理器对象，对象放在SpringMVC容器中
@RequestMapping("/question")
public class QuestionController {
    @Resource
    private QuestionService service;

    @RequestMapping("/getQuestionByQuesID.do")
    public void getQuestionByQuesID(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt (request.getParameter ("questionID"));//题目ID
        Question question = service.getQuestionByQuesID (id);
        String file_name = question.getFile_name ();
        JSONObject json = new JSONObject ();/*组装Json串*/
        try {
            json.put ("path", file_name);//传回地址
        } catch (JSONException e) {
            e.printStackTrace ();
        }
        IOUtil.returnResponse (response, json);
    }

    @RequestMapping("/getQuestionsByTaskID.do")
    public void getQuestionsByTaskID(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt (request.getParameter ("taskID"));
        List<Question> questions = service.getQuestionsByTaskID (id);
        /*组装Json串*/
        JSONObject json = new JSONObject ();
        json.put ("size", questions.size ());
        try {
            if (questions.size () > 0) {
                JSONArray questionArray = (JSONArray) JSONArray.toJSON (questions);
                json.put ("questions", questionArray);
            }
        } catch (JSONException e) {
            e.printStackTrace ();
        }
        IOUtil.returnResponse (response, json);
    }
}
