package OOPDemo1.src;

//榨汁机类
//带参数方法
public class ZhaZhiJi {
    //方法：榨汁
    //方法定义处 ：参数叫做形式参数，也叫形参（主要约束参数的类型）
    //形参名字可以随便取，但是要符合驼峰命名规则，同时要有意义
    public String zhazhi(int num,String fruit) {
        String zhi = num+"杯"+fruit+"汁";
        return zhi;
    }

}
