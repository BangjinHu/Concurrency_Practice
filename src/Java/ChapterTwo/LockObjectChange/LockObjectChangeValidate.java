package Java.ChapterTwo.LockObjectChange;

public class LockObjectChangeValidate {
    public static void main(String[] args) throws InterruptedException {
        Service service = new Service();
        ThreadA threadA = new ThreadA(service);
        threadA.setName("a");

        ThreadB threadB = new ThreadB(service);
        threadB.setName("b");

        threadA.start();
        Thread.sleep(3000);
        threadB.start();
    }
}
