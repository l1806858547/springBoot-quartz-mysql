package com.lsp.dao;

import com.lsp.pojo.DateFilter;
import com.lsp.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author lsp
 * @Title: OrderDao
 * @ProjectName lsp
 * @Description: TODO
 * @date 2019/1/22 9:02
 */
@Repository
public interface UserDao extends JpaRepository<User,Long> {

    List<User> findByUsername(String abc);

    List<User> findBySuccessTrue();

    User findByUsernameIs(String lps);

    User findByUsernameEquals(String lps);

    //like 'abc%'
    List<User> findByUsernameStartingWith(String s);

    //like 'abc'
    List<User> findByUsernameLike(String abc);

    //like '%abc'
    List<User> findByUsernameEndingWith(String abc);

    //like '%abc%'
    List<User> findByUsernameContaining(String abc);

    List<User> findByUsernameIgnoreCase(String abc);

    @Query(nativeQuery = true,value = "select count(*),DATE_FORMAT(a.date,'%e') as day from user a where DATE_FORMAT(a.date,'%Y %m')= :yearMonth  group by day")
    List<DateFilter> findByDateFilter(@Param("yearMonth")String yearMonth);
}
