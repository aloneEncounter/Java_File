/*
 * 宠物狗狗类
 * */

public class Dog extends Pet {

    private String strain = "聪明的拉布拉多犬";   //品种
    private String a;

    public Dog(){
        System.out.println("子类dog的无参构造方法");
    }

    public Dog(String name,int health,int love, String strain){
        super(name,health,love);
        this.strain=strain;
        System.out.println("子类dog的带参构造方法");
    }
    public Dog(String name,int health,int love, String strain,String a){
        this(name,health,love,strain);
        this.a=a;
    }



    public void setStrain(String strain) {
        this.strain = strain;
    }

    public String getStrain() {
        return this.strain;
    }

    public void print(){    //重写父类print()  overrides pet.print()
        //  调用父类
        // print（）
       // System.out.println(super.name);  //访问 父类属性
        super.print();   //访问父类 方法

        System.out.println("我是一只"+this.getStrain());
    }

    // 生病去医院
    public void toHospital(){
        System.out.println("打针、吃药");
        this.setHealth(60);
    }

    //吃饭
    public void eat(){
        if (this.getHealth()==100){
            System.out.println("狗狗"+this.getHealth()+"吃饱了，不需要喂食");
        }else{
            System.out.println("吃根骨头");
            this.setHealth(this.getHealth()+3);
        }
    }
    //狗狗叼飞碟
    public void catchFly(){
        System.out.println("狗狗叼飞碟");
    }

}

