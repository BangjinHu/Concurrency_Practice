package Java.ChapterTwo.ServiceTwoImpl;

public class ServiceValidate {

    public static void main(String[] args) {

        Service service = new Service();
        ThreadA threadA = new ThreadA(service);
        threadA.start();

        ThreadB threadB = new ThreadB(service);
        threadB.start();
    }
}
