package Java.ChapterFour.ReentrantLockTwo;

public class ThreadOne extends Thread {

    private MyService service;

    public ThreadOne(MyService service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.methodOne();
    }
}
