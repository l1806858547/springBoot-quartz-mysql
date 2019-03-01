package com.lsp.service.impl;

import com.lsp.dao.UserDao;
import com.lsp.pojo.DateFilter;
import com.lsp.pojo.User;
import com.lsp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author lsp
 * @Title: OrderServiceImpl
 * @ProjectName lsp
 * @Description: TODO
 * @date 2019/1/22 9:02
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public List<User> findAll() {
        //Integer pageNoNum = 0;
        //Integer pageSizeNum = 10;
        //Pageable pageable = null;
        //Sort sort = new Sort(Sort.Direction.ASC, "date");
        //pageable = new PageRequest(pageNoNum, pageSizeNum, sort);
        //userDao.findAll(pageable);
        //List<User> userList=userDao.findByUsername("abc");
        //List<User> userList2=userDao.findBySuccessTrue();
        //User user=userDao.findByUsernameIs("lps");
        //User user2=userDao.findByUsernameEquals("lps");
        //List<User> userList6=userDao.findByUsernameStartingWith("abc");
        //List<User> userList3=userDao.findByUsernameLike("abc");
        //List<User> userList4=userDao.findByUsernameEndingWith("abc");
        //List<User> userList5=userDao.findByUsernameContaining("abc");
        List<User> userList7=userDao.findByUsernameIgnoreCase("abc");
        return userDao.findAll();
    }

    @Override
    public void save(User user) {
        userDao.save(user);
    }

    @Override
    public List<DateFilter> findByDateFilter(String year, String month) {
        return userDao.findByDateFilter(year+" "+month);
    }
}
