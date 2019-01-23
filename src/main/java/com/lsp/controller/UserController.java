package com.lsp.controller;

import com.lsp.pojo.User;
import com.lsp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @author lsp
 * @Title: OrderController
 * @ProjectName lsp
 * @Description: TODO
 * @date 2019/1/22 9:00
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/user/queryList")
    public String queryList(Model model, HttpServletRequest request){
        List<User> userList=userService.findAll();
        return "test";
    }
}
