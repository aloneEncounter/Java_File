package OOPDemo1.src;//游人类

public class Visitor {
    //属性： 姓名   年龄
    int age;
    String name;

    //方法：根据游客年龄返回门票价格

    public void showPrice(){
        if (age<=10){
            System.out.println("门票免费！！");
        }else if (age<=60){
            System.out.println("门票全费：20元");
        }else{
            System.out.println("门票半价：10元");
        }
    }

}
