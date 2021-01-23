package com.qwer.admin.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.net.URLDecoder;

@Controller
@Slf4j
public class    FormTestController {
    @GetMapping("/form_layouts")
    public String form_layouts(){
        return "form/form_layouts";

    }

    @PostMapping("/upload")
    public String upload(@RequestParam("email")String email,
                         @RequestParam("password") String username,
                         @RequestPart("headerImg") MultipartFile headerImg,
                         @RequestPart("photos") MultipartFile[] photos) throws IOException {
        log.info("上传的信息,{},{},{},{}",email,username,headerImg.getSize(),photos.length);

        if(!headerImg.isEmpty()){
            String originalFilename = headerImg.getOriginalFilename();
            headerImg.transferTo(new File("C:\\Users\\曾百文\\qwer\\src\\main\\resources\\static\\file\\"+originalFilename));
        }
        //C:\Users\曾百文\AppData\Local\Temp\tomcat.8080.1554377532147157868\work\Tomcat\localhost\ROOT\
        if(photos.length>0){
            for(MultipartFile photo:photos){
                if(!photo.isEmpty()){
                    String originalFilename=photo.getOriginalFilename();
                    photo.transferTo(new File("C:\\Users\\曾百文\\qwer\\src\\main\\resources\\static\\file\\"+originalFilename));
                }
            }
        }
        return "main";
    }
}
