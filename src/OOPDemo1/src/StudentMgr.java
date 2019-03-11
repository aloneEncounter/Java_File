package OOPDemo1.src;

//实现学员信息的管理
public class StudentMgr {
    String[] names = new String[30];//学生姓名数组


    //增加学生姓名,参数name：需要添加的学员姓名
    public void addName(String name){
        for(int i=0;i<names.length;i++){
            if (names[i]==null){
                names[i]=name;
                break;
            }
        }
    }

    //在一定的区间查找某个学生
    //start 开始查找位置 end 结束查找位置    查找学生姓名 name
    public boolean searchName(int start,int end ,String name ){
        boolean flag=false;// 标识是否查找到特定学员  ，false 没找到，true 找到了
        for (int i=start-1;i<end;i++){
            if (names[i].equals(name)){  //字符串比较用equals
                flag=true;
                break;


            }
        }
        return  flag;
    }

    //显示学员姓名
    public void showName(){
        System.out.println("学员列表：");
        for (int i=0;i<names.length;i++){
            if (names[i] != null){
                System.out.println(names[i]);
            }
        }
    }


}
