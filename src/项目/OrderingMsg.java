package 项目;

import java.util.Scanner;

/**
 * 吃货联盟订餐系统
 */


public class OrderingMsg {
    public static void main(String[] args) {
        //数据主体，一组订单信息
        
        String[] names = new String[4];//订餐人
        String[] dishMegs = new String[4];//所定餐品信息
        int[] times = new int[4];//送餐时间
        String[] addresses = new String[4];//送餐地址
        int[] states = new int[4];//订单状态   0;已锁定 1：已完成
        double[] sumPrices = new double[4];//总金额

        //初始化2条订单信息
        names[0] = "张三";
        dishMegs[0] = "鱼香肉丝 1份";
        times[0] = 12;
        addresses[0] = "悦铃广场2号";
        states[0] = 0;
        sumPrices[0] = 24.0;

        names[1] = "张三";
        dishMegs[1] = "红烧带鱼 2份";
        times[1] = 12;
        addresses[1] = "悦铃广场2号";
        states[1] = 0;
        sumPrices[1] = 76.0;

        //数据主体：餐品信息
        String[] dishName = {"红烧带鱼", "鱼香肉丝", "时令蔬菜"};//餐品名
        double[] prices = {38.0, 18.0, 10.0};//餐品单价
        int[] praiseNums = new int[3];//点赞数
        System.out.println("欢迎使用吃货联盟订餐系统");
        Scanner input = new Scanner(System.in);
        int num = -1;
        //循环do--while
        do {
            System.out.println("*****************************************");
            System.out.println("1.我要订餐");
            System.out.println("2.查看餐袋");
            System.out.println("3.签收订单");
            System.out.println("4.删除订单");
            System.out.println("5.我要点赞");
            System.out.println("6.退出系统");
            System.out.println("*****************************************");
            //用户输入功能编号，并执行相应功能
            System.out.print("请选择：");
            int choose = input.nextInt();

            boolean isAdd = false;//true；记录找到一个为空的位置，可插入  false：没找到
            //根据用户输入的功能编号，执行相应操作
            switch (choose) {
                case 1:
                    //1.我要订餐
                    System.out.println("*****我要订餐*****");
                    //1、查找要插入的位置
                    for (int i = 0; i < names.length; i++) {
                        //如果找到为空的位置，记录下来
                        if (names[i] == null) {
                            //执行插入操作
                            isAdd = true;//记录已找到一个为空的位置

                            //a、显示所有可供选择的餐品信息
                            System.out.println("序号\t\t餐品名\t\t单价\t\t点赞数");
                            for (int j = 0; j < dishName.length; j++) {
                                String price = prices[j] + "元";
                                String praise = praiseNums[j] + "赞";
                                System.out.println(j + 1 + "\t  " + dishName[j] + "\t  " + price + "\t    " + praise);

                            }
                            //输入所选餐品编号及份数
                            System.out.print("请选择您要点的菜品编号：");
                            int chooseDish = input.nextInt();
                            System.out.print("请选择您需要的份数：");
                            int number = input.nextInt();
                            String disMeg = dishName[chooseDish - 1] + " " + number + "份";

                            //输入订餐人姓名
                            System.out.print("请输入订餐人姓名:");
                            String name = input.next();

                            //输入送餐时间
                            System.out.print("请输入送餐时间（10点至20点间整数送餐）：");
                            int time = input.nextInt();
                            //如果输错了，重复输入
                            while (time < 10 || time > 20) {
                                System.out.println("对不起，您的输入有误，请输入10~20间的整数：");
                                time = input.nextInt();
                            }

                            //输入送餐地址
                            System.out.print("请输入送餐地址：");
                            String address = input.next();

                            //计算餐费
                            double sumPrice = prices[choose - 1] * number;

                            //送餐费，当餐费达到50元时，免6元送餐费
                            double deliCharge = sumPrice > 50 ? 0.0 : 6.0;

                            //显示订单信息
                            System.out.println("订餐成功");
                            System.out.println("您定的是：" + disMeg);
                            System.out.println("订餐人：" + name);
                            System.out.println("送餐时间：" + time + "点");
                            System.out.println("送餐地址：" + address);
                            System.out.println("餐费:" + sumPrice + ",送餐费" + deliCharge + "元");
                            System.out.println("总经额：" + (sumPrice + deliCharge));

                            //保存数据
                            names[i] = name;
                            times[i] = time;
                            dishMegs[i] = disMeg;
                            addresses[i] = address;
                            sumPrices[i] = sumPrice + deliCharge;
                            break;
                        }
                    }
                    //如果没有找到为空的位置，则提示信息
                    if (!isAdd) {
                        System.out.println("对不起您的餐袋已满！");
                    }
                    break;
                case 2:
                    //2.查看餐袋
                    System.out.println("****查看餐袋****");
                    System.out.println("序号\t订餐人\t所定餐品信息 \t送餐时间 \t\t送餐地址 \t总金额 \t状态");
                    //遍历数组
                    for (int i = 0; i < names.length; i++) {
                        if (names[i] != null) {
                            String time = times[i] + "点";
                            String sumPrice = sumPrices[i] + "元";
                            String state = states[i] == 0 ? "已预定" : "已完成";
                            System.out.println(i + 1 + "\t" + names[i] + "\t\t" + dishMegs[i] + "\t" + time + "\t\t" + addresses[i] + "\t" + sumPrice + "\t" + state);
                        }
                    }
                    break;
                case 3:
                    //3.签收订单
                    System.out.println("*************签收订单***********");
                    //用户输入一个要签收的订单号
                    System.out.println("请输入要签收的订单序号：");
                    int signOrderId = input.nextInt();
                    boolean isFind = false;//记录是否找到了这条订单 true ：已找到  false：没找打
                    //查找这条订单（循环遍历）
                    for (int i = 0; i < names.length; i++) {
                        //1、找到，状态是已完成状态（已签收完毕）：提示不能再次签收
                        //2、找到，状态是已预定状态（没有完成签收）：可以签收
                        if (names[i] != null && states[i] == 1 && signOrderId == i + 1) {
                            System.out.println("对不起，您选择的订单已经完成签收，不能再次签收！");
                            isFind = true;  //找到订单
                            break;
                        } else if (names[i] != null && states[i] == 0 && signOrderId == i + 1) {
                            states[i] = 1;     //状态值改为已完成状态
                            System.out.println("订单签收成功");
                            isFind = true;
                            break;
                        }
                    }
                    //3、没找到，提示信息没有找到
                    //条件判断，如果没有找到这条订单，才去提示没有找到
                    if (!isFind) {
                        System.out.println("对不起，此订单不存在！");
                    }
                    break;
                case 4:
                    //4.删除订单
                    System.out.println("*****删除订单*****");
                    System.out.println("请输入要删除的订单序号：");
                    int del = input.nextInt();
                    int delIndex = -1;   //要删除订单的下标
                    boolean isDel = false;//记录是否找到词条 订单  true：找到了 false：没找到
                    //2、循环查找 订单
                    for (int i = 0; i < names.length; i++) {
                        //找到此订单，已签收：执行删除操作（先记录要删除订单的序号）
                        //找到订单未签收，：提示信息
                        if (names[i] != null && states[i] == 1 && del == i + 1) {
                            delIndex = i;
                            isDel = true;
                            break;
                        } else if (names[i] != null && states[i] == 0 && del == i + 1) {
                            System.out.println("您选择的订单，尚未签收不能删除");
                            isDel = true;
                            break;
                        }
                    }
                    //未找到，提示信息
                    if (!isDel) {
                        System.out.println("对不起词条订单不存在！");
                    }
                    //执行删除操作
                    if (delIndex != -1) {
                        for (int i = delIndex + 1; i < names.length - 1; i++) {
                            names[i - 1] = names[i];
                            times[i - 1] = times[i];
                            dishMegs[i - 1] = dishMegs[i];
                            addresses[i - 1] = addresses[i];
                            states[i - 1] = states[i];
                            sumPrices[i - 1] = sumPrices[i];
                        }
                        //清空最后一位
                        names[names.length - 1] = null;
                        dishMegs[dishMegs.length - 1] = null;
                        times[times.length - 1] = 0;
                        addresses[addresses.length - 1] = null;
                        states[states.length - 1] = 0;
                        sumPrices[sumPrices.length - 1] = 0;
                        System.out.println("订单删除成功！！！");
                    }

                    break;
                case 5:
                    //5.我要点赞
                    System.out.println("*****我要点赞******");
                    System.out.println("序号\t\t菜名\t\t单价\t\t点赞");
                    //1.显示共点赞的餐品列表
                    for (int i = 0; i < dishName.length; i++) {
                        String price = prices[i] + "元";
                        String praise = praiseNums[i] + "赞";
                        System.out.println(i + 1 + "\t  " + dishName[i] + "\t" + price + "\t" + praise);
                    }
                    //2.输入要点赞的餐品序号
                    System.out.print("请输入要点赞的餐品序号：");
                    int dishZ = input.nextInt();
                    //3.该序号的餐品点赞数加一
                    praiseNums[dishZ - 1]++;
                    //4.显示
                    System.out.println("点赞成功！！！");
                    System.out.println(dishName[dishZ - 1] + " " + praiseNums[dishZ - 1] + "赞");
                break;
                case 6:
                    //6.退出系统
                    break;
                default:
                    break;


            }
            //当用户输入的功能为1~5之外的数字时，退出循环
            if (choose < 1 || choose > 5) {
                break;
            } else {
                //提示输入0返回
                System.out.print("输入0返回：");


                num = input.nextInt();
            }
        } while (num == 0);
        System.out.println("  谢谢使用，欢迎下次光临！");
    }
}
