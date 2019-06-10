package Java.ChapterFour.ReentrantLockTwo;

public class Run {

    public static void main(String[] args) {
        MyService service = new MyService();
        ThreadOne threadOne = new ThreadOne(service);
        threadOne.setName("A");
        threadOne.start();

        ThreadTwo threadTwo = new ThreadTwo(service);
        threadTwo.setName("B");
        threadTwo.start();


    }
}
