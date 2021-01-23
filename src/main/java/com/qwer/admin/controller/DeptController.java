package com.qwer.admin.controller;

import com.qwer.admin.bean.*;
import com.qwer.admin.mapper.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;

/**
 * @author：cyn
 * @create：2018/12/30 16:27
 * @description：职位管理
 */
@RestController
@Controller
public class DeptController {

    @Autowired
    DepartmentMapper departmentMapper;


    @GetMapping("/dept/{id}")
    public Department getDepartment(@PathVariable("id") Integer id){

        return departmentMapper.getDeptById(id);

    }

    @GetMapping("dept")
    public Department insertDeptment(Department department){
        departmentMapper.insertDept(department);
        return department;
    }

}