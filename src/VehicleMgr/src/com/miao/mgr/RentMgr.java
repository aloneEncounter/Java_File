package com.miao.mgr;

import com.miao.vehicle.MotoVehicle;

import java.util.Scanner;

//汽车租赁管理类  ;测试类
public class RentMgr {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        MotoOperation motoMgr=new MotoOperation();
        //租赁公司 需要购置汽车
        motoMgr.init();
        System.out.println("***************欢迎光临租赁公司******************");
        System.out.println("1、轿车 \t 2、客车");
        System.out.print("请选择您要输入的汽车类型：");
        int motoType=input.nextInt();

        //这是客户租车的条件
        String brand="";    //品牌
        String type="";     //型号
        int seat=0;         //座位数

        //收集用户条件
        if (motoType==1){
            //租赁轿车
            System.out.println("请选择您要租赁的轿车品牌：1、别克  2、宝马");
            int choose=input.nextInt();
            if (choose==1){
                brand="别克";
                System.out.println("请选择您要租赁的汽车型号：1、林荫大道  2、GL8");
                type=(input.nextInt()==1) ? "林荫大道":"GL8";
            }else if (choose==2){
                brand="宝马";
                System.out.println("请选择您要租赁的汽车型号：1、X6  2、550i");
                type=(input.nextInt()==1) ? "X6":"550i";
            }

        }else if (motoType==2){
            //租赁客车
            type="";
            System.out.println("请您选择您要租赁的汽车品牌：1、金杯  2、 金龙");
            brand=(input.nextInt()==1)? "金杯":"金龙";
            System.out.println("请选择您要租赁的座位数：1、16座  2、34座");
            seat=(input.nextInt()==1)? 16:34;
        }

        //租车
        MotoVehicle moto=motoMgr.motoLeaseOut(brand,type,seat);

        System.out.println("请输入租赁天数：");
        int days=input.nextInt();
        float money=moto.calcRent(days);
        System.out.println("租车成功，请按照如下车牌号去提车:"+moto.getVehicleId());
        System.out.println("您需要支付："+money);

    }
}
