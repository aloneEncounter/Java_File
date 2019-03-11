package JavaApi.src.collectionsdemo;

public class Student implements Comparable {
    // 学号  姓名  性别
    private String name;
    private String sex;
    private int number;

    public Student(){}

    public Student(String name, String sex) {
        this.name = name;
        this.sex = sex;
    }

    public Student(String name, String sex, int number) {
        this.name = name;
        this.sex = sex;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }


    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    // 重写 聪明compare方法
    //编写一个比较规则：让当前学员对象（this）和传过来的学员对象（o）比较
    //以学员的学号为比较规则
    @Override
    public int compareTo(Object o) {
        Student student=(Student)o;
        if (this.number==student.number){
            return 0;

        }else if(this.number>student.number){
            return 1;
        }else {
            return -1;
        }
    }
 }