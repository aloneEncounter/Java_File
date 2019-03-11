package com.miao.vehicle;

//汽车类
public abstract class MotoVehicle {
    // 车牌号  品牌   日租金
    private String vehicleId;
    private String brand;
    private int perRent;

    //构造方法
    public MotoVehicle(){};

    public MotoVehicle(String vehicleId, String brand, int perRent) {
        this.vehicleId = vehicleId;
        this.brand = brand;
        this.perRent = perRent;
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPerRent() {
        return perRent;
    }

    public void setPerRent(int perRent) {
        this.perRent = perRent;
    }
        //计算租金(计算租金)
    public abstract float calcRent(int days);

}
