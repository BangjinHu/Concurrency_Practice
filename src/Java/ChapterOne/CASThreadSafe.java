package Java.ChapterOne;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class CASThreadSafe {
    private AtomicInteger atomicInteger = new AtomicInteger(0);
    private int i = 0;

    public static void main(String[] args) throws InterruptedException {
        final CASThreadSafe casThreadSafe = new CASThreadSafe();
        List<Thread> threadList = new ArrayList<>();
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100; i++){
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int j = 0; j < 1000; j++){
                        casThreadSafe.count();
                        casThreadSafe.safeCount();
                    }
                }
            });
            threadList.add(thread);
        }

        for (Thread thread : threadList){
            thread.start();
        }

        for (Thread thread : threadList){
            try {
                thread.join();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }

        System.out.println(casThreadSafe.i);
        System.out.println(casThreadSafe.atomicInteger.get());
        System.out.println(System.currentTimeMillis()-start);
    }

    private void safeCount(){
        for (;;){
            int i = atomicInteger.get();
            boolean suc = atomicInteger.compareAndSet(i, ++i);
            if (suc){
                break;
            }
        }
    }

    private void count(){
        i++;
    }
}
