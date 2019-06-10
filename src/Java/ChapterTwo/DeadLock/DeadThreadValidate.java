package Java.ChapterTwo.DeadLock;

public class DeadThreadValidate {
    public static void main(String[] args) {
        try {
            DeadThread deadThreadOne = new DeadThread();

            deadThreadOne.setFlag("a");
            Thread threadOne = new Thread(deadThreadOne);
            threadOne.start();

            Thread.sleep(1000);

            deadThreadOne.setFlag("b");
            Thread threadTwo = new Thread(deadThreadOne);
            threadTwo.start();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
