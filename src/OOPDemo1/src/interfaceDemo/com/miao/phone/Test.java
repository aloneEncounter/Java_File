package interfaceDemo.com.miao.phone;

public class Test {
    public static void main(String[] args) {
        CommonPhone comon=new CommonPhone("索尼爱立信","G502");
        comon.call();
        comon.sendMgs();
        comon.playVideo("南山南");
        comon.showInfo();
        System.out.println("******************************************");

        ZhiNengPhone zhiNeng=new ZhiNengPhone("苹果","xs");
        zhiNeng.showInfo();
        zhiNeng.call();
        zhiNeng.sendMgs();
        zhiNeng.takePhoto();
        zhiNeng.netWork();
        zhiNeng.playVideo("琅琊榜");

        String name="hello world";
        System.out.println(name.indexOf("o"));


    }
}
