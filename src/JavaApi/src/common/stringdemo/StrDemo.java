package JavaApi.src.common.stringdemo;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.StringTokenizer;

// 字符串的方法：equalsIgnoreCase()   toLowerCase 变小写 , toUpperCause  变大写
public class StrDemo {
    public static void main(String[] args) {
        String str1="adf;afda";
        String str2="Tom";
        System.out.println(str2.equals(str1));   // false
        System.out.println(str1.equalsIgnoreCase(str2));   // equals 忽略大小写 比较
        System.out.println(str1.toLowerCase().equals(str2.toLowerCase()));
        System.out.println(str1.toUpperCase().equals(str2.toUpperCase()));
        try {
            String a = URLEncoder.encode(str1,"UTF8");
            String b= URLDecoder.decode(str1,"GBK");
            System.out.println(b);
            System.out.println(a);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        //
        String s="  admin  ";
        System.out.println(s.trim());  //  去两端的空格

    }
}
