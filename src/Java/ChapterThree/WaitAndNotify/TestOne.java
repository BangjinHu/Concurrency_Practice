package Java.ChapterThree.WaitAndNotify;

public class TestOne {
    public static void main(String[] args) {
        try {
            String str = new String("");
            str.wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
