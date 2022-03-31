package com.huarui.bean;

/**
 * @author ：Ritchie Shao
 * @date ：Created in 2022/3/14 23:52
 * @description ：
 */
public class Teacher {
    private Integer id;
    private String name;
    private String age;

    public Teacher() {
    }

    public Teacher(Integer id, String name, String age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

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

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
