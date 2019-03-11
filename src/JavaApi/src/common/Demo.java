package JavaApi.src.common;
import sun.font.TrueTypeFont;

public class Demo {
    public static void main(String[] args) {
        //包装类的构造方法   （1）如何把基本数据类型变成包装类
        // （2）如何把字符串变成包装类

        //所有包装嘞都有的构造方法，将与之对应的基本数据类型做参数
        int i=9;
        Integer i1=new Integer(i);
        Double d=new Double(9.8);
        Boolean b=new Boolean(true);
        Float f=new Float(9.0);
        Character c=new Character ('a');

        System.out.println(i1+"\t"+d+"\t"+b+"\t"+c);

        //除character之外的包装类都有的构造方法，将字符串做参数

        Integer i2=new Integer("4");
        Double d2=new Double("9.8");
//        Boolean b2=new Boolean("true");
        Boolean b2=new Boolean("True");
        Float f2=new Float("9.0");

//        Character c2=new Character ("a");  //编译报错

        System.out.println(i2+"\t"+d2+"\t"+b2+"\t");


        System.out.println("***********************************************************");
        //valueOf （1）如何把基本数据类型变成包装类(所有包装类都有这个方法)

        Integer iNum =Integer.valueOf(89);
        Character cNum=Character.valueOf('z');
        Boolean bNum=Boolean.valueOf(false);


     //（2）如何把字符串变成包装类(除character外)

        Integer iNum2 =Integer.valueOf("89");
//        Character cNum2=Character.va
        Boolean bNum2=Boolean.valueOf("Love");
        System.out.println(bNum2);


    }

}
