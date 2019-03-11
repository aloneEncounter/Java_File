package vote;

/*

模拟实现选民投票过程，一群选民进行投票，每个选民只允许投一次票，并且当投票总数达到100时
，停止投票*/
//选民类
//投票总数，所有选民都会改变的同一个数据
//100，最大投票数，适用于全部的所有选民  stati final
public class Voter {
//    投票总数，所有选民都会改变的同一个数据  static
    private static int count;
//100，最大投票数，适用于全部的所有选民  stati final
    private static final int MAX_COUNT=100;

    private String name; //姓名


    public Voter(){};
    public Voter(String name){
        this.name=name;
    }


    public void setName(String name) {
        this.name=name;
    }

    public String getName(){
        return this.name;
    }

    //投票
    public void voteFor(){
        if(count==MAX_COUNT){
            System.out.println("投票活动已结束");
            return;    // 结束方法
        }else{
            count++;
            System.out.println(this.name+",感谢投票！！！！");
        }
    }

    //打印投票结果
    public static void printResult(){
        System.out.println("选民投票总数"+count);
    }

}
