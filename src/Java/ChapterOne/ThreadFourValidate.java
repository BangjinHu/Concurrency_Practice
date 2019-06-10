package Java.ChapterOne;

public class ThreadFourValidate {
    public static void main(String[] args) {
        ThreadFour thread = new ThreadFour();
        Thread threadOne = new Thread(thread, "threadOne");
        Thread threadTwo = new Thread(thread, "threadTwo");
        Thread threadThree = new Thread(thread, "threadThree");
        Thread threadFour = new Thread(thread, "threadFour");
        Thread threadFive = new Thread(thread, "threadFive");

        threadOne.start();
        threadTwo.start();
        threadThree.start();
        threadFour.start();
        threadFive.start();
    }
}
