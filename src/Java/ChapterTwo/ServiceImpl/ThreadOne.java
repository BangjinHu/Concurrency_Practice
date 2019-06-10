package Java.ChapterTwo.ServiceImpl;

public class ThreadOne extends Thread {
    private Service service;

    public ThreadOne(Service service) {
        super();
        this.service = service;
    }

    @Override
    public void run(){
        service.setUsernamePassword("a", "1122");
    }
}
