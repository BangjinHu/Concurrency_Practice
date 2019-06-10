package Java.ChapterFour.ReentrantLock;

public class Run {
    public static void main(String[] args) {
        MyService service = new MyService();
        MyThread threadOne = new MyThread(service);
        MyThread threadTwo = new MyThread(service);
        MyThread threadThree = new MyThread(service);
        MyThread threadFour = new MyThread(service);
        MyThread threadFive = new MyThread(service);
        MyThread threadSix = new MyThread(service);

        threadOne.start();
        threadTwo.start();
        threadThree.start();
        threadFour.start();
        threadFive.start();
        threadSix.start();
    }
}
