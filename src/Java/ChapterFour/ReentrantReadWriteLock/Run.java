package Java.ChapterFour.ReentrantReadWriteLock;

public class Run {
    public static void main(String[] args) throws InterruptedException {
        Service service = new Service();
        ThreadA threadA = new ThreadA(service);
        threadA.setName("a");
        threadA.start();

        Thread.sleep(1000);

        ThreadB threadB = new ThreadB(service);
        threadB.setName("b");
        threadB.start();


    }
}
