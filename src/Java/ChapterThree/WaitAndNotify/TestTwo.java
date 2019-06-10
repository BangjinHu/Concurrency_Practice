package Java.ChapterThree.WaitAndNotify;

public class TestTwo {

    public static void main(String[] args) {
        try {
            String lock = new String();
            System.out.println("syn上面");
            synchronized (lock){
                System.out.println("syn第一行");
                lock.wait();
                System.out.println("wait下的程序");

            }
            System.out.println("syn下的程序");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
