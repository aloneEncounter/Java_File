package JavaApi.src.stu;

import java.io.Serializable;

public class Person extends FatherTest implements Serializable {
    private int id;
    private String name;
    private String address;
    private String message;


    public Person(){
        System.out.println("通过无参构造实例话Person类对象的实例");
    }

    private Person( String name, String address, String message) {
        this.name = name;
        this.address = address;
        this.message = message;
        System.out.println("通过有参构造实例话Person类对象的实例");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + "\'" +
                ", address='" + address + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
