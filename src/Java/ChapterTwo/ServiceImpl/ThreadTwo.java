package Java.ChapterTwo.ServiceImpl;

public class ThreadTwo extends Thread {

    private Service service;

    public ThreadTwo(Service service) {
        super();
        this.service = service;
    }

    @Override
    public void run(){
        service.setUsernamePassword("b", "2233");
    }

}
