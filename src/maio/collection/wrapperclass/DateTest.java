package maio.collection.wrapperclass;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;

public class DateTest
{
    public static void main(String[] args)
    {
        Date date = new Date();//从1900年1月1日起

        System.out.println(date);

        System.out.println(date.getYear());
        System.out.println(date.getTime());

        Calendar c = Calendar.getInstance();//从1970年1月1日

        System.out.println(c.getTime());//Date
        System.out.println(c.getWeekYear());

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

        System.out.println(sdf.format(date));
        System.out.println(sdf.format(c.getTime()));


        //JDK8引入了joda-time
        System.out.println(LocalTime.now());
        System.out.println(LocalDate.now());


    }
}
