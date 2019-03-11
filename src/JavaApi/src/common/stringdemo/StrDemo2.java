package JavaApi.src.common.stringdemo;
//字符串截取  indenxOf()  lastindexOf()    substring(begin)   substring(begin,end)

public class StrDemo2 {
    public static void main(String[] args) {
        String s="hello,my name is miaofeng!ok";

        System.out.println(s.indexOf("o"));
        System.out.println(s.indexOf("w"));  // 如果没找到返回的是 -1

        System.out.println(s.lastIndexOf("o"));
        //起始位置--结束位置-1；
        System.out.println(s.substring(4)); // 截取时，包含起始位置，不包含终止位置

    }
}
