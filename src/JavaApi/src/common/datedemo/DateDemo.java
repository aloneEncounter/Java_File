package common.datedemo;


import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {
    public static void main(String[] args) {
        //当前日期和时间
        Date date=new Date();
        System.out.println(date);   //Tue Nov 20 18:16:37 CST 2018

        //将日期和时间的格式变为我们要求的格式：”年-月-日“
        SimpleDateFormat formater=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String now=formater.format(date);
        System.out.println(now);

    }
}
