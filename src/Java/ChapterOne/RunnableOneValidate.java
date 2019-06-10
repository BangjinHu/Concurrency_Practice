package Java.ChapterOne;

public class RunnableOneValidate {
    public static void main(String[] args) {
        Runnable runnable = new RunnableOne();
        //Thread构造函数支持传进一个Runnable接口对象
        Thread thread = new Thread(runnable);
        thread.start();
        System.out.println("运行结束！");
    }
}
