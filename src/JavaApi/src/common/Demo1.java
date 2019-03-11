package JavaApi.src.common;
public class Demo1 {
    public static void main(String[] args) {
        // 包装类--》基本类型    xxxValue
        Integer i=new Integer(9);
        int j=i.intValue();
        System.out.println(j);

        Boolean b=new Boolean(true);
        boolean b1=b.booleanValue();


        // 基本类型--》变成字符串 1、toString（） 2、+""
        int num=9;
        String strNum=Integer.toString(num);
        String strNum2=num+"";

        //字符串--》基本类型  parsexxx（）  Character除外

        String s="89";

        int num2=Integer.parseInt(s);

        Boolean bNum=Boolean.parseBoolean("true");
        System.out.println(num2);

    }
}
