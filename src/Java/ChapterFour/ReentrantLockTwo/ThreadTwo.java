package Java.ChapterFour.ReentrantLockTwo;

public class ThreadTwo extends Thread {

    private MyService service;

    public ThreadTwo(MyService service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.methodOne();
    }
}
