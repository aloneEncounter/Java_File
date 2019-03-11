package com.miao.vehicle;

//轿车类
public class Car extends MotoVehicle {
    // 型号
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    //构造方法
    public Car() {
    }

    public Car(String vehicleId, String brand, int perRent, String type) {
        super(vehicleId, brand, perRent);  //  调用父类构造
        this.type = type;
    }

    //计算租金    重写父类的计算租金方法：根据自己的计算租金规则
    @Override
    public float calcRent(int days) {
        float price = this.getPerRent() * days;
        if (days > 7 && days <= 30) {
            price *= 0.9f;
        } else if (days > 30 && days <= 150) {
            price *= 0.8f;
        } else if(days >150) {
            price *= 0.7f;
        }
        return price;
    }
}
