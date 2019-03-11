package extendsDemo.fuleizuocanshu;


//主人类
public class Master {
    //赠送动物
    public Animal sendAnimal(String type){
        Animal animal=null;
        if(type.equals("cat")){
            animal=new Cat();
        }else if (type.equals("dog")){
            animal=new Dog();
        }else{
            animal=new Duck();
        }
        return   animal;
    }


    /*public Cat sendAnimal(String type){
        if (type.equals("cat")){
            return new Cat();

        }else
            return null;
    }

    public Dog sendAnimal2(String type){
        if (type.equals("dog")){
            return new Dog();

        }else
            return null;
    }*/
}

