package com.huarui.controller;

import com.huarui.bean.Student;
import com.huarui.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author ：Ritchie Shao
 * @date ：Created in 2022/3/12 16:20
 * @description ：
 */
@Controller//创建处理器对象，对象放在SpringMVC容器中
@RequestMapping("/student")
public class StudentController {

    @Resource//自动注入
    private StudentService service;

    /**
     * 自定义方法来处理用户提交的请求
     * "@RequestMapping"（请求映射）作用是把一个请求地址和一个方法绑定在一起
     * 属性：value 是一个String，表示请求uri地址，必须唯一，不能重复
     * method 指定请求方法
     * 接收参数的形式：
     * 1、逐个接收请求参数，解决参数名和形参名不一致的问题使用 @RequestParam(value, required)，用在形参前
     * 2、对象接收请求参数，形参对象的属性名要和请求参数名一致，框架自动注入
     */
    @RequestMapping(value = "/addStudent.do")
    public ModelAndView addStudent(Student student) {
        ModelAndView mv = new ModelAndView ();//数据和视图
        String tips = "注册失败";//提示语
        //调用service来处理student
        int nums = service.addStudent (student);
        if (nums > 0) {
            //注册成功
            tips = "学生 [" + student.getName () + "] 注册成功";
        }
        //添加数据
        mv.addObject ("tips", tips);
        mv.addObject ("hello", "Hello world");
        //指定结果页面，显示上面传过来的数据，框架帮助完成
        mv.setViewName ("result");//页面的逻辑名称，所以文件应在src/main/webapp/WEB-INF/jsp目录之下
        return mv;
    }

    /**
     * 处理学生查询，响应Ajax
     */
    @RequestMapping("/queryStudent.do")
    @ResponseBody
    public List<Student> queryStudent() {
        //参数检查，简单的数据处理
        List<Student> students = service.findStudents ();//查询结果
        return students;//这个结果会被框架转换成一个JSON数组
    }

}
