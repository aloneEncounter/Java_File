package JavaApi.src.ColloectionDemos;
import java.util.LinkedList;

public class LinkedListDemo {
    public static <lisk> void main(String[] args) {
        // 集合储存多条新闻标题
        NewTitle title1=new NewTitle(1,"北京终于晴天了1","admin");
        NewTitle title2=new NewTitle(2,"北京终于晴天了2","admin");
        NewTitle title3=new NewTitle(3,"北京终于晴天了3","admin");
        NewTitle title4=new NewTitle(4,"北京终于晴天了4","admin");
        NewTitle title5=new NewTitle(5,"北京终于晴天了5","admin");
        NewTitle title6=new NewTitle(6,"北京终于晴天了6","admin");
        NewTitle title7=new NewTitle(7,"北京终于晴天了7","admin");


        //使用时会报错，调用方法时，调用父类类型的 方法 掉用不了子类独有的方法
//        List list =new LinkedList();
        LinkedList<NewTitle> list =new LinkedList<NewTitle> ();
        list.add(title1);
        list.add(title2);
        list.add(title3);
        list.add(1,title4);
        list.addFirst(title5);   //  在列表首部加
        list.addLast(title6);    //  在列表尾部加
        list.add(title7);
        System.out.println(list.size());

        for (int i = 0; i <list.size() ; i++) {
//            NewTitle title=(NewTitle)list.get(i);
            NewTitle title=list.get(i);
            System.out.println(title.getId()+"--"+title.getTitle());
        }

        System.out.println("***********************************");
/*        for (Object obj:list) {
            NewTitle title=(NewTitle)obj;
            System.out.println(title.getId()+"--"+title.getTitle());
        }*/
        for (NewTitle title:list) {
            System.out.println(title.getId()+"--"+title.getTitle());
        }

        list.removeFirst();// 删除头一个元素
        System.out.println("***********************************");
/*        for (Object obj:list) {
            NewTitle title=(NewTitle)obj;
            System.out.println(title.getId()+"--"+title.getTitle());
        }*/
        for (NewTitle title:list) {
            System.out.println(title.getId()+"--"+title.getTitle());
        }

        list.removeLast();// 删除最后一个元素
        System.out.println("***********************************");
        for (NewTitle title:list) {
            System.out.println(title.getId()+"--"+title.getTitle());
        }


        System.out.println("************************************");
//        NewTitle firstNew=(NewTitle)list.getFirst();
        NewTitle firstNew=list.getFirst();
        System.out.println("头条新闻标题："+firstNew.getTitle());
//        NewTitle lastNew=(NewTitle)list.getLast();
        NewTitle lastNew=list.getLast();
        System.out.println("末条新闻标题："+lastNew.getTitle());
    }
}
