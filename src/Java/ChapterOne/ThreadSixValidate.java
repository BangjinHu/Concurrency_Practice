package Java.ChapterOne;

public class ThreadSixValidate {

    public static void main(String[] args) throws InterruptedException {
        ThreadSix threadSix = new ThreadSix();
        System.out.println("开始" + threadSix.isAlive());
        threadSix.start();
        Thread.sleep(1000);
        System.out.println("结束" + threadSix.isAlive());
    }
}
