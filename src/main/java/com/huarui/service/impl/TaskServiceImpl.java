package com.huarui.service.impl;

import com.huarui.bean.Task;
import com.huarui.dao.TaskDao;
import com.huarui.service.TaskService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @author ：Ritchie Shao
 * @date ：Created in 2022/3/17 23:44
 * @description ：
 */
@Service
public class TaskServiceImpl implements TaskService {
    @Resource
    private TaskDao taskDao;

    @Override
    public List<Task> getTasksByStuID(int stuID) {
        List<Task> list = new ArrayList<> ();
        list.clear ();
        list.addAll (taskDao.getTasksByStuID (stuID));
        return list;
    }

    @Override
    public List<Task> getTasksByTeaID(int teaID) {
        List<Task> list = new ArrayList<> ();
        list.clear ();
        list.addAll (taskDao.getTasksByTeaID (teaID));
        return list;
    }
}
