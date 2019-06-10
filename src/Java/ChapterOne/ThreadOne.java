package Java.ChapterOne;

public class ThreadOne extends Thread {
    @Override
    public void run(){
        super.run();
        System.out.println("thread of me");
    }
}
