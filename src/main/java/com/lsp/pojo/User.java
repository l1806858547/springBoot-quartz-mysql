package com.lsp.pojo;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

/**
 * @author lsp
 * @Title: User
 * @ProjectName lsp
 * @Description: TODO
 * @date 2019/1/22 11:48
 */
@Entity
@Data
@Table(name = "user", schema = "shopproduce", catalog = "")
public class User {
    @Id
    @GeneratedValue
    private Integer uid;
    @Column(unique =true)
    private String username;//帐号
    private String name;//名称（昵称或者真实姓名，不同系统不同定义）
    private String password; //密码;
    private String salt;//加密密码的盐
    private byte state;//用户状态,0:创建未认证（比如没有激活，没有输入验证码等等）--等待验证的用户 , 1:正常状态,2：用户被锁定.
    private Boolean success;//是否启用
    private Date date;
}
