package Java.ChapterOne;

public class ThreadThreeValidate {
    public static void main(String[] args) {
        ThreadThree threadThreeOne = new ThreadThree("threadOne");
        ThreadThree threadThreeTwo = new ThreadThree("threadTwo");
        ThreadThree threadThreeThree = new ThreadThree("threadThree");

        threadThreeOne.start();
        threadThreeTwo.start();
        threadThreeThree.start();

    }
}
