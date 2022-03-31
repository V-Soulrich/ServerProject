package com.huarui.bean;


/**
 * @author ：Ritchie Shao
 * @date ：Created in 2022/3/17 15:22
 * @description ：随堂测试类
 */
public class Task {
    private Integer id;//随堂测试ID
    private String name;//随堂测试名
    private String create_time;//创建时间
    private Integer creator_id;//创建者ID（只有教师可以创建随堂测试）

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCreate_time() {
        return create_time;
    }

    public void setCreate_time(String create_time) {
        this.create_time = create_time;
    }

    public Integer getCreator_id() {
        return creator_id;
    }

    public void setCreator_id(Integer creator_id) {
        this.creator_id = creator_id;
    }
}
