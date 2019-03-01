package com.lsp.controller;

import com.lsp.pojo.DateFilter;
import com.lsp.pojo.User;
import com.lsp.service.UserService;
import com.lsp.util.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.text.ParseException;
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
    @ResponseBody
    public Object queryList(Model model, HttpServletRequest request){
        List<DateFilter> userList=userService.findByDateFilter("2019","01");
        //List<User> userList=userService.findAll();
        return userList;
    }

    @RequestMapping("/user/saveUsers")
    @ResponseBody
    public Object saveUsers() throws ParseException {
        for(int i=0;i<10;i++){
            User user=new User();
            user.setUsername("lsp"+i);
            user.setDate(DateUtil.getDayDate(i));
            user.setState((byte) 1);
            userService.save(user);
        }
        return "ok";
    }
}
