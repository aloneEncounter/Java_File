package mymarket;

import java.text.SimpleDateFormat;
import java.util.*;

// 业务类
public class MemberDao {
    Scanner input = new Scanner(System.in);
    List<Member> memberList = new ArrayList<>();

    // 开始菜单
    public void menu() {
        System.out.println("*********************************欢迎使用超市会员管理系统*****************************");
        System.out.println("1、积分累计  2、积分兑换  3、查询剩余积分  4、修改密码  5、开卡    6、退出");
        System.out.println("**********************************************************************************");
        System.out.print("请选择：");
    }


    public void start() {
        do {
            menu();
            int choose = input.nextInt();
            switch (choose) {
                case 1:
                    //积分累积
                    if (saveScore()) {
                        System.out.println("积分累计成功！！");
                    } else {
                        System.out.println("积分累计失败！！");
                    }
                    continue;

                case 2:
                    //积分兑换

                    if (minusScore()) {
                        System.out.println("积分兑换成功！！");
                    } else {
                        System.out.println("积分兑换失败！！");
                    }
                    continue;

                case 3:
                    //积分查询
                    showScore();
                    continue;

                case 4:
                    //  修改密码
                    revampPassword();
                    continue;

                case 5:
                    //   开卡
                    register();
                    continue;
                case 6:
                    //退出
                    System.out.println("感谢您的使用，欢迎下次使用！！");
                    break;
                default:
                    System.out.println("您操作有误，请重新选择：");
                    continue;
            }
            break;
        } while (true);


    }

    //查询当前会员是否存在,根据会员卡号及密码查找该会员是否存在，存在返回会员对象，不存在返回null
    public Member hasMember(int id, String pwd) {
        for (Member member : memberList) {
            if (member.getCarId() == id && member.getPassword().equals(pwd)) {
                return member;
            }
        }
        return null;
    }

    //积分累积
    public boolean saveScore() {
        boolean flag = true;
        System.out.print("请输入会员卡号：");
        int id = input.nextInt();
        System.out.print("请输入会员卡的密码：");
        String pwd = input.next();
        Member member = hasMember(id, pwd);
        if (member != null) {
            System.out.print("请输入您此次消费金额（1元积一分）：");
            int score = input.nextInt();
            member.setScore(member.getScore() + score);
            flag = true;
        } else {
            System.out.println("不好意思该会员卡不存在！！无法积分");
            flag = false;
        }

        return flag;
    }


    //积分兑换
    public boolean minusScore() {
        boolean flag = true;
        System.out.print("请输入会员卡号：");
        int id = input.nextInt();
        System.out.print("请输入会员卡的密码：");
        String pwd = input.next();
        Member member = hasMember(id, pwd);
        if (member != null) {
            System.out.print("请输入您此次抵用的积分：");
            int score = input.nextInt();
            if (score <= member.getScore()) {     //100 分抵0.1元
                member.setScore(member.getScore() - score);
                System.out.println("您此次抵消：" + score / 100 * 0.1 + "元");

            } else {
                System.out.println("抱歉，积分不足，无法兑换！！");
            }
            flag = true;
        } else {
            System.out.println("不好意思该会员卡不存在！！无法积分兑换");
            flag = false;
        }

        return flag;
    }

    //积分查询
    public void showScore() {
        System.out.print("请输入会员卡号：");
        int id = input.nextInt();
        System.out.print("请输入会员卡的密码：");
        String pwd = input.next();
        Member member = hasMember(id, pwd);
        if (member != null) {
            System.out.println("会员卡号    姓名     剩余积分      开卡日期");
            System.out.println(member.getCarId() + "\t" + member.getName() + "\t\t" + member.getScore() + "\t" + member.getRegistDate());
        } else {
            System.out.println("不好意思，该会员不存在，无法查询积分！！");
        }
    }

    // 修改密码
    public void revampPassword() {
        System.out.print("请输入会员卡号：");
        int id = input.nextInt();
        System.out.println("请输入会员卡的密码：");
        String pwd = input.next();
        Member member = hasMember(id, pwd);
        if (member != null) {
            System.out.println("请输入要修改的密码：");
            String pwd1;
            boolean falg = true;
            do {
                pwd1 = input.next();      //  判断 密码长度是否正确
                if (pwd1.length() < 6) {
                    System.out.println("会员密码不能小于6位！！请重新输入一个密码：");
                    falg = false;
                }else {
                    member.setPassword(pwd1);
                    falg = true;
                }
            } while (false);
            System.out.println("密码重置成功，新密码为：" + member.getPassword());

        } else {
            System.out.println("不好意思，该会员不存在，无法修改密码！！");
        }
    }

    // 生成随机卡号

    public int createdId() {
        Random random = new Random();
        int id = random.nextInt(99999999);
        for (Member member : memberList) {
            if (member.getCarId() == id) {
                id = random.nextInt(99999999);
            }
        }
        return id;
    }

    // 开卡
    public void register() {
        Member member = new Member();
        System.out.print("请输入注册的姓名：");
        member.setName(input.next());
        // 会员卡号随机生成
        int cardId = createdId();
        member.setCarId(cardId);
        // 保证用户密码输入正确
        System.out.print("请输入注册密码：");
        String pwd;
        boolean falg = true;
        do {
            pwd = input.next();      //  判断 密码长度是否正确
            if (pwd.length() < 6) {
                System.out.println("会员密码不能小于6位！！请重新输入一个密码：");
                falg = false;
            } else {
                falg = true;
                member.setPassword(pwd);
            }
        } while (false);
        // 每卡 默认开卡后 赠送100分
        member.setScore(100);
        //开卡日期
        Date data = new Date();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String sdate = format.format(data);
        member.setRegistDate(sdate);
        System.out.println("恭喜，会员卡开通成功！系统赠送您100积分，您的会员卡号时：" + cardId);
        memberList.add(member);
    }


}

