package com.huarui.bean;

/**
 * @author ：Ritchie Shao
 * @date ：Created in 2022/3/18 18:16
 * @description ：题目类
 */
public class Question {

    private Integer id;//题目ID
    private Integer type;//题目类型{单选题：1，多选题：2，填空题：3，判断题：4}
    private String file_name;//题目所存储的文件名

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getFile_name() {
        return file_name;
    }

    public void setFile_name(String file_name) {
        this.file_name = file_name;
    }
}
