package com.miao.vehicle;

//客车类
public class Bus extends MotoVehicle {
    // 座位
    private int seatCount;

    public int getSeatCount() {
        return seatCount;
    }

    public void setSeatCount(int seatCount) {
        this.seatCount = seatCount;
    }

    //构造方法
    public Bus() {
    }

    public Bus(String vehicleId, String brand, int perRent, int seatCount) {
        super(vehicleId, brand, perRent);  //  调用父类构造
        this.seatCount = seatCount;
    }

    //计算租金   重写父类的计算租金方法：根据自己的计算租金规则
    @Override
    public float calcRent(int days) {
        float price = this.getPerRent() * days;
        if (days >= 3 && days < 7) {
            price *= 0.9f;

        } else if (days >= 7 && days < 30) {
            price *= 0.8f;
        } else if (days >= 30 && days < 150) {
            price *= 0.7f;
        } else if (days >= 150) {
            price *= 0.6;
        }
        return price;
    }
}
