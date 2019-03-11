package ExceptionDemo;

public class Person {
    private String name;
    private int age;
    private String sex;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) throws GenderException {
        if (sex.equals("男") || sex.equals("女")) {
            this.sex = sex;
        } else {
            //抛出异常
//            Exception e=new Exception("性别只能是男/女");
//            throw e;
            throw new GenderException("性别只能是男/女");
        }
    }

    //输出个人信息
    public void print() {
        System.out.println(this.getName() + "-" + this.getName() + "-" + this.getAge());
    }

    public static void main(String[] args){
        Person p = new Person();
        try {
            p.setSex("boy");
            p.print();
        }catch (GenderException e) {
            e.printStackTrace();  // 打印堆栈信息
        }
    }
}
