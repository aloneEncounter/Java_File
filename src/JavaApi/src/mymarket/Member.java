package mymarket;
// 会员类
public class Member {
    // 姓名  卡号   密码  积分  开卡日期
    private String name;
    private int  carId;
    private String password;
    private int score;
    private String registDate;  //注册


    public Member(){}

    public Member(String name, int carId, String password, int score, String registDate) {
        this.name = name;
        this.carId = carId;
        this.password = password;
        this.score = score;
        this.registDate = registDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCarId() {
        return carId;
    }

    public void setCarId(int carId) {
        this.carId = carId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getRegistDate() {
        return registDate;
    }

    public void setRegistDate(String registDate) {
        this.registDate = registDate;
    }
}
