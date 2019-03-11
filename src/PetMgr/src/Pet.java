//父类  ：宠物类

public abstract class Pet {
    String name = "无名氏";    //昵称，默认值是“无名氏”
    private int health = 100;     //健康值，默认值是100，健康值在1-100之间，小于60为不健康
    private int love = 0;    //亲密度

    public Pet(){
        System.out.println("父类的无参构造方法");
    }
    public Pet(String name){
        this.name=name;
        System.out.println("父类带一个参的构造方法");
    }
    public Pet(String name,int health,int love){
        this.name=name;
        this.health=health;
        this.love=love;
        System.out.println("带3个参数的构造方法");
    }


    //为private的属性加一对getter和setter
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setLove(int love) {
        if (love <= 0) {
            System.out.println("亲密度不能为60");
            return;
        }
        this.love = love;
    }

    public int getLove() {
        return this.love;
    }


    //为private  的属性加一对setter和getter

    public void setHealth(int health) {
        if (health < 0) {
            //如果健康值不正确，强制赋值60，同事给用户一个提示，然后结束方法
            this.health = 60;
            System.out.println("健康之不能为负数");
            return;  //  结束/跳出方法
        }
        // 如果健康值合法，则可直接赋值
        this.health = health;
    }

    //get  有返回值  类型与属性类型是一致的
    public int getHealth() {
        return this.health;            //写法 规定这样写
    }

    /*
    狗狗的信息
    * */
    public void print() {
        System.out.println("宠物自白：\n我的名字交：" + name + ",健康值是：" + health +
                ",和主人的亲密的是：" + love);
    }

    // 生病去医院  抽象方法，没有方法体
    //



    public abstract void toHospital();

    //吃饭
    public abstract void eat();
}
