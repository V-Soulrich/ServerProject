package com.huarui.controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.huarui.bean.Task;
import com.huarui.service.TaskService;
import com.huarui.utils.IOUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * @author ：Ritchie Shao
 * @date ：Created in 2022/3/17 15:22
 * @description ：随堂测试控制块
 */
@Controller//创建处理器对象，对象放在SpringMVC容器中
@RequestMapping("/task")
public class TaskController {
    @Resource
    private TaskService taskService;

    @RequestMapping("/getTasksByStuID.do")
    public void getTasksByStuID(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt (request.getParameter ("studentID"));
        List<Task> tasks = taskService.getTasksByStuID (id);
        JSONObject json = new JSONObject ();//组装JSON串
        try {
            json.put ("size", tasks.size ());//tasks长度
            JSONArray taskArray = new JSONArray ();//tasks列表
            if (tasks.size () > 0) {
                for (int i = 0; i < tasks.size (); i++) {
                    JSONObject tempObject = JSONObject.parseObject (JSONObject.toJSON (tasks.get (i)).toString ());
                    taskArray.add (tempObject);
                }
            }
            json.put ("tasks", taskArray);
        } catch (Exception e) {
            e.printStackTrace ();
        }
        IOUtil.returnResponse (response, json);
    }

    @RequestMapping("/getTasksByTeaID.do")
    public void getTasksByTeaID(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt (request.getParameter ("teacherID"));
        List<Task> tasks = taskService.getTasksByTeaID (id);
        JSONObject json = new JSONObject ();
        try {
            json.put ("size", tasks.size ());//tasks长度
            JSONArray taskArray = new JSONArray ();//tasks列表
            if (tasks.size () > 0) {
                for (int i = 0; i < tasks.size (); i++) {
                    JSONObject tempObject = JSONObject.parseObject (JSONObject.toJSON (tasks.get (i)).toString ());
                    taskArray.add (tempObject);
                }
            }
            json.put ("tasks", taskArray);
        } catch (Exception e) {
            e.printStackTrace ();
        }
        IOUtil.returnResponse (response, json);
    }

}
