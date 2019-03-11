/*
企鹅类
*/

public class Penguin extends Pet {

    String sex="Q宰";

    public Penguin(){

    }
    public Penguin(String name,int health ,int love,String sex){
        super(name,health,love);
        this.sex=sex;
        System.out.println("子类penguin的带参构造方法");
    }



    public String getSex(){
        return sex;
    }
    public void setSex(String sex){
        this.sex=sex;
    }

    public void print() {
        //
        super.print();
        System.out.println("我是的性别是："+this.getSex());
    }
    public void toHospital(){
        System.out.println("吃药、疗养");
        this.setHealth(70);
    }

    //吃饭
    public void eat(){
        if (this.getHealth()==100){
            System.out.println("企鹅"+this.getHealth()+"吃饱了，不需要喂食");
        }else{
            System.out.println("吃小鱼");
            this.setHealth(this.getHealth()+5);
        }
    }

    //企鹅在南极游泳
    public void swim(){
        System.out.println("企鹅在南极游泳");
    }

}
