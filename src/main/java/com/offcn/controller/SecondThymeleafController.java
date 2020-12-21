package com.offcn.controller;

import com.offcn.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.Map;

import java.util.HashMap;

@Controller
public class SecondThymeleafController {

    @GetMapping("/second")
    public String indexPage(Model model){
        String message = "Hello, Thymeleaf!";
        User u = new User();
        u.setId(1);
        u.setName("俊俊");
        u.setAge(10);
        model.addAttribute("message", message);
        model.addAttribute("user", u);
        Map<String, Object> map = new HashMap<>();
        map.put("src1", "1.jpg");
        map.put("src2", "2.png");
        model.addAttribute("src", map);
        return "index2";

    }
}
