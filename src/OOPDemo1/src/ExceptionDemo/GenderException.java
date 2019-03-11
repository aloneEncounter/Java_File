package ExceptionDemo;

//程序中只要性别输入错误，都会引起这个异常
public class GenderException extends Exception {
    public GenderException(){}

    public GenderException(String message) {   //添加构造方法
        super(message);
    }

}
