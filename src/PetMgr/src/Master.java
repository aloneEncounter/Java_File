// 主人类
public class Master {
    // 为宠物看病
    //为狗狗看病
    public void cure(Pet pet){
        if (pet.getHealth()<50){
            pet.toHospital();
        }
    }

    /*//为狗狗看病
    public void cure(Dog dog){
        if (dog.getHealth()<50){
            System.out.println("打针、吃药");
            dog.setHealth(60);

        }
    }


    //为企鹅看病
    public void cure(Penguin penguin){
        if (penguin.getHealth()<50){
            System.out.println("吃药、疗养");
            penguin.setHealth(70);
        }
    }*/

    //宠物喂食
    public void feed(Pet pet){
        pet.eat();
    }
}
