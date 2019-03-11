package maio.multi_thread.runnable;

public class RunnableWithLambdaExpressionTest
{
    public static void main(String[] args)
    {
        new Thread(() -> System.out.println("my runnable is running")).start();
    }
}
