package com.huarui.bean;

/**
 * @author ：Ritchie Shao
 * @date ：Created in 2022/3/16 15:42
 * @description ：班级群聊
 */
public class Group {
    private Integer id;
    private String name;
    private String icon_url;

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

    public String getIcon_url() {
        return icon_url;
    }

    public void setIcon_url(String icon_url) {
        this.icon_url = icon_url;
    }

    @Override
    public String toString() {
        return "Group{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", icon_url='" + icon_url + '\'' +
                '}';
    }
}
