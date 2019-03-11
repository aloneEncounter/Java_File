package common.datedemo;


import sun.util.resources.cldr.aa.CalendarData_aa_ER;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

//通过 Calendar 类 获取时间
//1、  没办法 new 对象，通过  Calendar.getInstance() 获取一个对象
//2、获取年月日 通过 get() 方法， Calendar.MONTH  月份时从0开始 计算的 故结果需要加1
public class DateDemo2 {
    public static void main(String[] args) {
        //日期时间
        Calendar t = Calendar.getInstance();  //抽象类 获得一个Calendar 对象

        System.out.println(t.get(Calendar.YEAR) + "-" + (t.get(Calendar.MONTH)+1)+ "-" + t.get(Calendar.DAY_OF_MONTH));
        System.out.println("今天是星期几呢：" + (t.get(Calendar.DAY_OF_WEEK)-1));
        System.out.println(t.getTime());

        System.out.println("****************************");
        Date time=new Date();
        System.out.println(time);
//        System.out.println((char) time.getTime());
        SimpleDateFormat formater=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(formater.format(time));
        Date time1=new Date();
        System.out.println(time1);
    }
}
