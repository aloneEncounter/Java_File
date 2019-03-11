package OOPDemo1.src;

//计算机类
//同名 不同参  ----》方法重载
public class CalctTest {
    //加法
    public int add(int num1,int num2){
        return num1+num2;
    }

    public double add(double num1,double num2){
        return num1+num2;
    }
    public double add(double num1,double num2,double num3){
        return num1+num2+num3;
    }

    public static void main(String[] args) {
        CalctTest c=new CalctTest();
        c.add(5,6);
    }


}
