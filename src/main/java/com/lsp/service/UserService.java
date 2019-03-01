package com.lsp.service;

import com.lsp.pojo.DateFilter;
import com.lsp.pojo.User;

import java.util.List;

/**
 * @author lsp
 * @Title: OrderService
 * @ProjectName lsp
 * @Description: TODO
 * @date 2019/1/22 9:01
 */
public interface UserService {

    List<User> findAll();

    void save(User user);

    /**
     * 查询某年某个月注册的人数
     * @return
     * @param year
     * @param month
     */
    List<DateFilter> findByDateFilter(String year, String month);
}
