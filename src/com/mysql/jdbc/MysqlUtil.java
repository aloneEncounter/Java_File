package com.mysql.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MysqlUtil {

    public static Connection getConn(){

        Connection conn=null;

        try {
            // 1、加载驱动
            Class.forName("com.mysql.jdbc.Driver");
            //2、建立连接
//             conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/school?characterEncoding=UTF8&useSSL=false","root","miao123");
             conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/school?serverTimezone=UTC&&characterEncoding=UTF8&useSSL=false","root","miao123");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }



    public static void closeConn(Connection conn,PreparedStatement ps, ResultSet rs){


        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }

        if (ps != null) {
            try {
                ps.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }

}
