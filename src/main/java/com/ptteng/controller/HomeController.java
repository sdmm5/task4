package com.ptteng.controller;


import com.ptteng.dao.StudentDao;
import com.ptteng.dao.VocationDao;
import com.ptteng.entity.Student;
import com.ptteng.entity.Vocation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by litao on 2017/2/28.
 */

@Controller
public class HomeController {
    @Autowired
    private StudentDao dao;

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String getHomeInfo(ModelMap modelMap){
        List<Student> list = dao.findAllGoodStudent();
        modelMap.put("list",list);
        return "home";
    }
}
