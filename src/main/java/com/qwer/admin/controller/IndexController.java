package com.qwer.admin.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;
import com.qwer.admin.bean.User;
import javax.servlet.http.HttpSession;

@Slf4j
@Controller
public class IndexController {

    @Autowired
    JdbcTemplate jdbcTemplate;

//    @Autowired
//    CityService cityService;
//
//    @ResponseBody
//    @GetMapping("/city")
//    public City getCityById(@RequestParam("id") Long id){
//        return cityService.getById(id);
//    }

//    @Autowired
//    Depart departmentMapper;
//
//
//    @GetMapping("/dept/{id}")
//    public Department getDepartment(@PathVariable("id") Integer id){
//
//        return departmentMapper.getDeptById(id);
//
//    }
//
//    @GetMapping("dept")
//    public Department insertDeptment(Department department){
//        departmentMapper.insertDept(department);
//        return department;
//    }

    @GetMapping(value = {"/","/login"})
    public String loginPage(){

        return "login";
    }

    @PostMapping("/login")
    public String main(User user, HttpSession session, Model model){ //RedirectAttributes
        System.out.println(user.getUserName());
        if(false){
            //把登陆成功的用户保存起来
            session.setAttribute("loginUser",user);
            //登录成功重定向到main.html;  重定向防止表单重复提交
            return "redirect:/main";
        }else {
            model.addAttribute("msg","账号密码错误");
            //回到登录页面
            return "login";
        }

    }

    @GetMapping("/main")
    public String mainPage(HttpSession session,Model model){
        return "main";
    }
}
