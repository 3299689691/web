package com.qwer.admin.bean;

/**
 * @author：cyn
 * @create：2018/12/30 16:17
 * @description：职位实体类
 */

public class Department {

    private Integer id;                   //职位id
    private String departmentName;        //职位名

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