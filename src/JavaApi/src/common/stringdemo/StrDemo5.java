package JavaApi.src.common.stringdemo;

import java.util.Scanner;

//字符串拆分方法 split()
public class StrDemo5 {
    public static void main(String[] args) {
       /* String words="长亭外 古道边 芳草碧连天 晚风 拂柳 笛声残";
        String[] printWords=new String[100];


        System.out.println("原歌词：");
        System.out.println(words);
        printWords=words.split(" ",4);
        System.out.println("拆分后：");
        for (String info:printWords) {
            System.out.println(info);
        }
*/

        /*Scanner input =new Scanner(System.in);
        System.out.println("请输入一个带空格的字符串（每个字符用空格隔开）:");
        String info=input.next();
        System.out.println("请输入要查找的字符：");
        String want =input.next();
        String[] infos=info.split(" ");

        //特定字符出现的次数
        int count=0;
        for (int i = 0; i <infos.length ; i++) {
            if (infos[i].equals(want)){
                count++;
            }
        }
        System.out.println(want + "在" + info + "中出现的次数：" + count);
*/


        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个字符串:");
        String info = input.next();
        System.out.println("请输入要查找的字符：");
        String want = input.next();
        //String[] infos=info.split(" ");
        String[] temp=new String[info.length()];
        //特定字符出现的次数
        int count = 0;
        for (int i = 0; i < temp.length; i++) {
            temp[i]=info.substring(i,i+1);
            if (temp[i].equals(want)) {
                count++;
            }
        }
        System.out.println("\""+want + "\"在\"" + info + "\"中出现的次数：" + count);

    }
}

