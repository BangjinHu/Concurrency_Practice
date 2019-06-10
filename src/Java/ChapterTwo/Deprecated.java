package Java.ChapterTwo;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Deprecated {
    public static void main(String[] args) throws InterruptedException {
        DateFormat format = new SimpleDateFormat("HH:mm:ss");
        Thread thread = new Thread(new Runner(), "printThread");
        thread.setDaemon(true);
        thread.start();

        TimeUnit.SECONDS.sleep(3);

        thread.suspend();
        System.out.println("main suspend thread at " + format.format(new Date()));

        TimeUnit.SECONDS.sleep(3);
        thread.resume();
        System.out.println("main resume thread at " + format.format(new Date()));

        TimeUnit.SECONDS.sleep(3);
        thread.stop();
        System.out.println("main stop thread at " + format.format(new Date()));
        TimeUnit.SECONDS.sleep(3);

    }

    public static class Runner implements Runnable {

        @Override
        public void run() {
            DateFormat format = new SimpleDateFormat("HH:mm:ss");
            while (true){
                System.out.println(Thread.currentThread().getName() + "run at" + format.format(new Date()));

            }
        }
    }
}
