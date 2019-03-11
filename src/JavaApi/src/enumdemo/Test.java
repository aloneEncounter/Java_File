package JavaApi.src.enumdemo;
// 根据用户给的数字 （1--7）对应的日期该做什么事

public class Test {
    public void doWhat(int day) {
        //传统写法
        if (day > 7 || day < 1) {
            System.out.println("输入数字错误，应在1-7之间：");
            return;
        }
        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("工作日，好好写代码");
                break;
            case 6:
                System.out.println("周日啦，看看电影休息下");
                break;
            case 7:
                System.out.println("周日啦，你可以睡个懒觉");
                break;
        }
    }
    //  使用枚举限制 输入的类型
    public void doWhat2(Week day) {
        switch (day) {
            case MON:
            case TUE:
            case WED:
            case THU:
            case FRI:
                System.out.println("工作日，好好写代码");
                break;
            case SAT:
                System.out.println("周日啦，看看电影休息下");
                break;
            case SUN:
                System.out.println("周日啦，你可以睡个懒觉");
                break;
        }
    }

    public static void main(String[] args) {
        Test t = new Test();
        t.doWhat(10);
        t.doWhat2(Week.SUN);
    }

}
