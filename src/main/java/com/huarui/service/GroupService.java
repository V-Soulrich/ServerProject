package com.huarui.service;

import com.huarui.bean.Group;

import java.util.List;

/**
 * @author ：Ritchie Shao
 * @date ：Created in 2022/3/16 15:58
 * @description ：
 */
public interface GroupService {
    List<Group> getGroupsByStuID(int id);

    List<Group> getGroupsByTeaID(int id);
}
