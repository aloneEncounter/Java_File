package com.miao.mgr;

import com.miao.vehicle.Bus;
import com.miao.vehicle.Car;
import com.miao.vehicle.MotoVehicle;

//汽车业务类
public class MotoOperation {
    //汽车类型的数组
    public MotoVehicle[] motos = new MotoVehicle[8];


    // 初始化汽车信息
    public void init() {
        motos[0] = new Car("京N78654", "宝马", 800, "X6");  //父类引用指向子类对象 MotoVehicle m=new Car():
        motos[1] = new Car("京CN3284", "宝马", 600, "550i");  //父类引用指向子类对象 MotoVehicle m=new Car():
        motos[2] = new Car("京N37465", "别克", 300, "别克林荫大道");  //父类引用指向子类对象 MotoVehicle m=new Car():
        motos[3] = new Car("京NT8987", "别克", 600, "GL8");  //父类引用指向子类对象 MotoVehicle m=new Car():
        motos[4] = new Bus("京N78624", "金杯", 800, 16);  //父类引用指向子类对象 MotoVehicle m=new Bus():
        motos[5] = new Bus("京N78634", "金龙", 800, 16);  //父类引用指向子类对象 MotoVehicle m=new Bus():
        motos[6] = new Bus("京N55555", "金杯", 1500, 34); //父类引用指向子类对象 MotoVehicle m=new Bus():
        motos[7] = new Bus("京N77777", "金龙", 1500, 34);  //父类引用指向子类对象 MotoVehicle m=new Bus():

    }


    //租车(根据用户的条件 去数组中找，相应车辆并返回)
    //如果租赁的是客车 需要的条件是：品牌  座位数 型号 null
    //如果租赁的是轿车需要的条件是：品牌 型号  座位数0
    //声明返回的是父类类型  但实际上返回的是具体子类对象  ----简单工厂模式
    public MotoVehicle motoLeaseOut(String brand, String type, int seat) {
        MotoVehicle moto = null;
        for (MotoVehicle mymoto : motos) {
            if (mymoto instanceof Car) {
                Car car = (Car) mymoto;    //  向下转型
                if (car.getBrand().equals(brand) && car.getType().equals(type)) {
                    moto = car;
                    break;
                }
            } else {
                Bus bus = (Bus) mymoto;
                if (bus.getBrand().equals(brand) && bus.getSeatCount() == seat) {
                    moto = bus;
                    break;
                }
            }
        }
        return moto;
    }
}

