package com.ptteng.controller;

import com.ptteng.dao.UserDao;
import com.ptteng.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import util.TokenProcessor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * /Users/maweijiang/IdeaProjects/task4/src/main/java/com/ptteng/controller/HomeController.java
 * Created by maweijiang on 2017/3/4.
 */
@Controller
public class RegisteredController {
    @Autowired
    private UserDao dao;

    @RequestMapping(value = "/registered",method = RequestMethod.GET)
    public String addUser(HttpServletRequest request, HttpServletResponse response) throws IOException{
        String user_name = request.getParameter("user_name");
        String user_password = request.getParameter("user_password");
        User u = new User();
        u.setUser_name(user_name);
        u.setUser_password(user_password);
        dao.addUser(u);
        return "/registered";
    }
}
