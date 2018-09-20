package com.lucifer.springboot.bean;

/**
 * @author: Lucifer
 * @create: 2018-09-20 10:47
 * @description:
 **/
public class Department {

    private Integer id;
    private String departmentName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
}
