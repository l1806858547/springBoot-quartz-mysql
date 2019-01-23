package com.lsp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author lsp
 * @Title: Lsp
 * @ProjectName lsp
 * @Description: TODO
 * @date 2018/12/24 17:31
 */
//@EntityScan("com.lsp.pojo")
//@EnableJpaRepositories("com.lsp.dao")
@SpringBootApplication
public class Lsp {

    public static void main(String[] args) {
        SpringApplication.run(Lsp.class, args);
    }
}
