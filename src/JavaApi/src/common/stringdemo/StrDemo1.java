package JavaApi.src.common.stringdemo;
//字符串的连接
public class StrDemo1 {
    public static void main(String[] args) {
        int num=9;
        System.out.println("num的值是："+num);

        //concat()  链接两个字符串
        String s="你好：";
        String s2="张三";
        String newStr=s.concat(s2);
        System.out.println(newStr);

    }

}
