package Java.ChapterOne;

public class ThreadSevenValidate {

    public static void main(String[] args) {
        try {
            ThreadSeven threadSeven = new ThreadSeven();
            threadSeven.start();

            Thread.sleep(2000);
            threadSeven.interrupt();
        } catch (InterruptedException e) {
            System.out.println("main catch");
            e.printStackTrace();
        }
    }
}
