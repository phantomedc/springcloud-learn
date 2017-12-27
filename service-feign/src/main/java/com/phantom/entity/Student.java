package com.phantom.entity;

//import io.swagger.annotations.ApiModel;
//import io.swagger.annotations.ApiModelProperty;

/**
 * Created by john on 2017/12/26.
 */
//@ApiModel(value = "Student")
public class Student {

    //@ApiModelProperty(value = "学生姓名", dataType = "String", name = "name", example = "黄栋云", required = true)
    private String name;

    //@ApiModelProperty(value = "学生年龄", dataType = "int", name = "age", example = "23", required = true)
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
