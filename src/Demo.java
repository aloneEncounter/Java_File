import java.util.Scanner;

public class Demo {
    static int a;
    public int a(){
        a++;
        return a;
    }



    public static void main(String[] args) {
        int i = 0;
        System.out.println(1 > 2 && ++i > 2);
        System.out.println(i);

        System.out.println(7&11);  //3
        System.out.println(2|3);    //3
        System.out.println(~7);
        System.out.println(~12);
        System.out.println(7^11);   //12

        System.out.println(2<<2);
        int x=5;
        System.out.println(x/2);

        Scanner input=new Scanner(System.in);
        int a=input.nextInt();
        a:
        for (int j = 0; j <10 ; j++) {
            if (j==5){
                System.out.println("hello");
                System.out.println(a);
                break a;
            }
        }
    }
}
