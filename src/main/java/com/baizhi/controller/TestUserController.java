package com.baizhi.controller;

import com.baizhi.entity.User;
import com.baizhi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@SpringBootApplication
@RequestMapping("us")
public class TestUserController {
    @Autowired
    private UserService userService;

    @RequestMapping("queryAll")
    public String queryAll(HttpSession session) {
        List<User> userList = userService.queryAll();
        session.setAttribute("list", userList);
        return "index";

    }
}
