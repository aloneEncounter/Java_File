package com.mysql.jdbc;

import org.junit.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MysqlJdbcTest {



    @Test
    public void testAdd() {

        User user = new User(1011, "乔治", 24);

        Connection conn = null;

        PreparedStatement ps = null;

        try {
            // 获取数据库连接
            conn = MysqlUtil.getConn();

            String sql = "insert into user (user_name,age) values (?,?)";  // ？是占位符
            // 3、预处理sql语句
            ps = conn.prepareStatement(sql);

            //绑定预处理参数    (索引位置，指上边sql语句中的占位符位置)
            //4、绑定预处理参数    (索引位置，指上边sql语句中的占位符位置)
            ps.setString(1, user.getUsername());
            ps.setInt(2, user.getAge());
            //5、 执行预处理语句
            int res = ps.executeUpdate();
            if (res > 0) {
                System.out.println("更新表数据成功！");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        // 6、关闭连接
        MysqlUtil.closeConn(conn, ps, null);
    }


    @Test
    public void testGetUserById() {
        Connection conn = null;

        PreparedStatement ps = null;

        ResultSet rs = null;

        try {
            conn = MysqlUtil.getConn();

            String sql = "select id ,user_name,age from user where id=? ";

            //3、预处理
            ps = conn.prepareStatement(sql);

            //4、绑定预处理语句
            ps.setInt(1, 2);
            ps.setInt(1, 3);

            //5、执行预处理语句
            rs = ps.executeQuery();

//           ps.executeUpdate();//用于增、删、改用的执行语句
//            ps.executeQuery();//用于查询用的执行语句


            User user = null;
            if (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("user_name");
                int age = rs.getInt("age");
                user = new User(id, name, age);
            }
            System.out.println(user);


        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            //6、关闭连接
            MysqlUtil.closeConn(conn, ps, rs);
        }

    }

    @Test
    public void testListUser() {

        Connection conn = null;

        PreparedStatement ps = null;

        ResultSet rs = null;


        try {

            conn = MysqlUtil.getConn();

            String sql = "select id,user_name,age from user";
            // 3、预处理sql
            ps = conn.prepareStatement(sql);

            //4、执行预处理语句，并返回reasultset 对象
            rs = ps.executeQuery();

            List<User> list = new ArrayList<>();// 使用ArrayList便于查询遍历数据
            User user = null;

            while (rs.next()) {
                int id = rs.getInt("id");
                String name=rs.getString("user_name");
                int age = rs.getInt("age");

                user = new User(id, name, age);

                list.add(user);
            }

//            list.stream().forEach(userInfo-> System.out.println(userInfo));

            list.stream().forEach(System.out::println);

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {

            //6、关闭连接
            MysqlUtil.closeConn(conn,ps,rs);
        }
    }

    @Test
    public void testUpdateUser(){

        User user=new User(2,"李四",23);

        Connection conn=null;

        PreparedStatement ps=null;



        try {
            conn=MysqlUtil.getConn();

            String sql="update user set user_name=?,age=? where id=?";
            //3、获取预处理语句
            ps=conn.prepareStatement(sql);

            //4、绑定预处理参数
            ps.setInt(3,user.getId());

            ps.setString(1,user.getUsername());

            ps.setInt(2,user.getAge());

            //5、执行预处理语句
           int effRow=ps.executeUpdate();

           if(effRow>0){
               System.out.println("修改成功！");
           }

        } catch (SQLException e) {
            e.printStackTrace();
        }finally{
            //6、获取连接
            MysqlUtil.closeConn(conn,ps,null);
        }

    }

    @Test
    public void testDelete(){

        Connection conn=null;

        PreparedStatement ps=null;

        try {

            conn=MysqlUtil.getConn();

            String sql="delete from user where id=?";

            //预处理sql语句
            ps=conn.prepareStatement(sql);

            //绑定预处理参数
            ps.setInt(1,5);

            //执行预处理语句
            int effRow=ps.executeUpdate();
            if (effRow >0) {
                System.out.println("删除成功！！");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }finally{

            MysqlUtil.closeConn(conn,ps,null);
        }
    }

}
