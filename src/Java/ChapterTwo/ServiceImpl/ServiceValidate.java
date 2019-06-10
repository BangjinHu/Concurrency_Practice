package Java.ChapterTwo.ServiceImpl;

public class ServiceValidate {
    public static void main(String[] args) {
        Service service = new Service();
        ThreadOne threadOne = new ThreadOne(service);
        threadOne.setName("A");
        threadOne.start();

        ThreadTwo threadTwo = new ThreadTwo(service);
        threadTwo.setName("B");
        threadTwo.start();
    }
}
