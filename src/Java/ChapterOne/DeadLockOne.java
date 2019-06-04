package Java.ChapterOne;

//死锁
public class DeadLockOne {

    private static String A = "A";
    private static String B = "B";

    public static void main(String[] args) {
        Thread threadOne = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (A){
                    try {
                        Thread.currentThread().sleep(2000);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }

                    synchronized (B){
                        System.out.println("1");
                    }
                }
            }
        });

        Thread threadTwo = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (B){
                    synchronized (A){
                        System.out.println("2");
                    }
                }
            }
        });

        threadOne.start();
        threadTwo.start();
    }
}
