package JavaApi.src.ColloectionDemos;

//新闻标题类

public class NewTitle {
    //ID  新闻题目   作者
    private int id;
    private String title;
    private String author;

    public NewTitle(){}

    public NewTitle(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuther(String author) {
        this.author = author;
    }


}
