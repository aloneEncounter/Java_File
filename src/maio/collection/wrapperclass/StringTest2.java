package maio.collection.wrapperclass;

import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Arrays;

public class StringTest2
{
    public static void main(String[] args) throws Exception
    {
        String str = "dflkajflda;fjad;ljfla";

//        System.out.println(str.substring(1));
//        System.out.println(str.substring(1, 3));
//        System.out.println(str.toUpperCase());
//        System.out.println(str.replace("fjad", "bbb"));
//
//        String[] strArr = str.split(";");
//        System.out.println(Arrays.toString(strArr));
//        System.out.println(str.startsWith("dl"));
//        System.out.println(str.endsWith("la"));

        byte[] byteArr = str.getBytes();
        System.out.println(Arrays.toString(byteArr));

        String string = new String(byteArr, "utf8");

//        System.out.println(string);


//        String encode = URLEncoder.encode(str, "utf8");
//        System.out.println("encode:" + encode);
//
//        String decode = URLDecoder.decode(encode, "utf8");
//        System.out.println(decode);

        System.out.println(str.indexOf('d'));


    }
}
