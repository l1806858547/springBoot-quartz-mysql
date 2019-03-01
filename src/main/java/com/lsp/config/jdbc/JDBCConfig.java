package com.lsp.config.jdbc;

import java.lang.annotation.*;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.TYPE;

/**
 * @author lsp
 * @Title: JDBCConfig
 * @ProjectName lsp
 * @Description: TODO
 * @date 2019/1/18 17:08
 */
//表示这个注解可以用用在类/接口上，还可以用在方法上
@Target({METHOD,TYPE})
//表示这是一个运行时注解，即运行起来之后，才获取注解中的相关信息，
// 而不像基本注解如@Override 那种不用运行，在编译时eclipse就可以进行相关工作的编译时注解。
@Retention(RetentionPolicy.RUNTIME)
//表示这个注解可以被子类继承
@Inherited
//表示当执行javadoc的时候，本注解会生成相关文档
@Documented
public @interface JDBCConfig {
    String ip();
    int port() default 3306;
    String database();
    String encoding();
    String loginName();
    String password();
}
