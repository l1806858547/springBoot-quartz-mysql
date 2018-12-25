package com.lsp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;

/**
 * @author lsp
 * @Title: Lsp
 * @ProjectName lsp
 * @Description: TODO
 * @date 2018/12/24 17:31
 */
@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class, HibernateJpaAutoConfiguration.class})
public class Lsp {

    public static void main(String[] args) {
        SpringApplication.run(Lsp.class, args);
    }
}
