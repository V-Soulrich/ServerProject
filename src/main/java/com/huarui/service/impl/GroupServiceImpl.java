package com.huarui.service.impl;

import com.huarui.bean.Group;
import com.huarui.dao.GroupDao;
import com.huarui.service.GroupService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @author ：Ritchie Shao
 * @date ：Created in 2022/3/16 15:59
 * @description ：
 */
@Service
public class GroupServiceImpl implements GroupService {

    @Resource
    private GroupDao groupDao;

    @Override
    public List<Group> getGroupsByStuID(int id) {
        List<Group> list = new ArrayList<> ();
        list.clear ();
        list.addAll (groupDao.getGroupsByStuID (id));
        return list;
    }

    @Override
    public List<Group> getGroupsByTeaID(int id) {
        List<Group> list = new ArrayList<> ();
        list.clear ();
        list.addAll (groupDao.getGroupsByTeaID (id));
        return list;
    }
}
