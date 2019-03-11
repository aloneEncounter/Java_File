package maio.collection.list1;

public class Demo2 {
    private String name;

    public Demo2(){}

    public Demo2( String name) {

        this.name = name;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString(){
        return "demo-->"+"\tname:"+name;
    }
}
