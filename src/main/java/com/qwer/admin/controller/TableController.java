package com.qwer.admin.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.qwer.admin.bean.User;
import com.qwer.admin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class TableController {

    @Autowired
    UserService userService;

    @GetMapping("/user/delete/{id}")
    public String deleteUser(@PathVariable("id") Long id,
                             @RequestParam(value = "pn",defaultValue = "1")Integer pn,
                             RedirectAttributes ra){
        userService.removeById(id);
        ra.addAttribute("pn",pn);
        return "redirect:/dynamic_table";

    }
    @GetMapping("/dynamic_table")
    public String dynamic_table(@RequestParam(value = "pn",defaultValue = "1")Integer pn,Model model){
//        List<User> list=userService.list();
//        model.addAttribute("users",list);

        Page<User> page = new Page<>(pn,2);

        Page<User> userPage=userService.page(page,null);
        long current = page.getCurrent();
        long pages=page.getPages();
        long total = page.getTotal();
        List<User> records = page.getRecords();
        model.addAttribute("users",userPage);
        return "table/dynamic_table";
    }
}
