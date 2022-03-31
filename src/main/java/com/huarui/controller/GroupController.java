package com.huarui.controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.huarui.bean.Group;
import com.huarui.service.GroupService;
import com.huarui.utils.IOUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * @author ：Ritchie Shao
 * @date ：Created in 2022/3/16 15:50
 * @description ：班级群聊控制块
 */
@Controller//创建处理器对象，对象放在SpringMVC容器中
@RequestMapping("/group")
public class GroupController {

    @Resource
    private GroupService service;

    @RequestMapping("/getGroupsByStuID.do")
    public void getGroupsByStuID(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt (request.getParameter ("studentID"));
        List<Group> groups = service.getGroupsByStuID (id);
        /*组装Json串*/
        JSONObject json = new JSONObject ();
        try {
            json.put ("size", groups.size ());//groups长度
            //groups列表
            JSONArray groupArray = new JSONArray ();
            if (groups.size () > 0) {
                for (int i = 0; i < groups.size (); i++) {
                    JSONObject tempObject = JSONObject.parseObject (JSONObject.toJSON (groups.get (i)).toString ());
                    groupArray.add (tempObject);
                }
            }
            json.put ("groups", groupArray);
        } catch (JSONException e) {
            e.printStackTrace ();
        }
        IOUtil.returnResponse (response, json);
    }

    @RequestMapping("/getGroupsByTeaID.do")
    public void getGroupsByTeaID(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt (request.getParameter ("teacherID"));

        List<Group> groups = service.getGroupsByTeaID (id);
        /*组装Json串*/
        JSONObject json = new JSONObject ();
        try {
            json.put ("size", groups.size ());//groups长度
            //groups列表
            JSONArray groupArray = new JSONArray ();
            if (groups.size () > 0) {
                for (int i = 0; i < groups.size (); i++) {
                    JSONObject tempObject = JSONObject.parseObject (JSONObject.toJSON (groups.get (i)).toString ());
                    groupArray.add (tempObject);
                }
            }
            json.put ("groups", groupArray);
        } catch (JSONException e) {
            e.printStackTrace ();
        }
        IOUtil.returnResponse (response, json);
    }
}
