package maio.collection.list1;

public class Demo1 {
    private int id;
    private String name;

    public Demo1(){}

    public Demo1(int id, String name) {
        this.id = id;
        this.name = name;
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

    public String toString(){
        return "demo-->"+"id:"+id+"\tname:"+name;
    }
}
