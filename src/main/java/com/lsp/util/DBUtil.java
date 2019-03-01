package com.lsp.util;

import com.lsp.config.jdbc.JDBCConfig;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author lsp
 * @Title: Dbutil
 * @ProjectName lsp
 * @Description: TODO
 * @date 2019/1/18 17:05
 */
//public class DBUtil {
//    static String ip = "127.0.0.1";
//    static int port = 3306;
//    static String database = "test";
//    static String encoding = "UTF-8";
//    static String loginName = "root";
//    static String password = "root";
//    static{
//        try {
//            Class.forName("com.mysql.cj.jdbc.Driver");
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//    }
//
//    public static Connection getConnection() throws SQLException {
//        String url = String.format("jdbc:mysql://%s:%d/%s?characterEncoding=%s&serverTimezone=Hongkong", ip, port, database, encoding);
//        return DriverManager.getConnection(url, loginName, password);
//    }
//    public static void main(String[] args) throws SQLException {
//        System.out.println(getConnection());
//    }
//}
@JDBCConfig(ip = "127.0.0.1", database = "test", encoding = "UTF-8", loginName = "root", password = "root")
public class DBUtil {
    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() throws SQLException, NoSuchMethodException, SecurityException {
        JDBCConfig config = DBUtil.class.getAnnotation(JDBCConfig.class);

        String ip = config.ip();
        int port = config.port();
        String database = config.database();
        String encoding = config.encoding();
        String loginName = config.loginName();
        String password = config.password();

        String url = String.format("jdbc:mysql://%s:%d/%s?characterEncoding=%s&serverTimezone=Hongkong", ip, port, database, encoding);
        return DriverManager.getConnection(url, loginName, password);
    }

    public static  void main(String[] args) throws NoSuchMethodException, SecurityException, SQLException {
        Connection c = getConnection();
        System.out.println(c);
    }
}


