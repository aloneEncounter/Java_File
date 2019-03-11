package vote;
//测试选民投票

public class TestVoter {
    public static void main(String[] args) {
        Voter zhang =new Voter("张三");
        zhang.voteFor();

        for (int i=1;i<=99;i++){
            Voter v=new Voter("v"+i);
            v.voteFor();
        }

        Voter V101=new Voter("wangwu");
        V101.voteFor();
        Voter.printResult();

    }


}
