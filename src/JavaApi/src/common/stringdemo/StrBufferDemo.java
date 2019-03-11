package JavaApi.src.common.stringdemo;

import java.util.Scanner;

//StringBuffer 类
public class StrBufferDemo {
    public static void main(String[] args) {
        //String-->StringBuffer
       /* StringBuffer s1=new StringBuffer("hello");
        s1.append("world");
        System.out.println(s1);
        s1.insert(1,",");
        System.out.println(s1);
*/


        /*//StringBUffer ---->String  用toString() 方法
        String s=s1.toString();
        System.out.println(s.concat("world"));
        System.out.println(s);*/

        Scanner input=new Scanner(System.in);
        System.out.println("请输入一串数字：");
        String number=input.next();
        StringBuffer snumber=new  StringBuffer(number);

        for(int i=snumber.length()-3;i>0;i=i-3){
            snumber.insert(i,",");
        }
        System.out.println(snumber);
    }
}
