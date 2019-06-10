package Java.ChapterOne;

public class ThreadFiveValidate {
    public static void main(String[] args) {
        ThreadFive threadFive = new ThreadFive();
        Thread thread = new Thread(threadFive);

        thread.setName("thead");
        thread.start();
    }
}
