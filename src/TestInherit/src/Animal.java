// myeclipse  中生成 getter 、setter 快捷键 alt+shift+s
public class Animal {
    private String sex;
    private int age;

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        Animal a=new Animal();
        System.out.println(a.toString());     //  Animal@4554617c
        System.out.println(a.getClass());    //  class Animal
    }
}
