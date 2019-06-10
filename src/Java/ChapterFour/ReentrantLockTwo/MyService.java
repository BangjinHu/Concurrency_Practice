package Java.ChapterFour.ReentrantLockTwo;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyService {
    private Lock lock = new ReentrantLock();
    public void methodOne(){
        try {
            lock.lock();
            System.out.println("methodOne begin threadName = " + Thread.currentThread().getName() + " time = " + System.currentTimeMillis());
            Thread.sleep(5000);

            System.out.println("methodOne end threadName = " + Thread.currentThread().getName() + " time = " + System.currentTimeMillis());

        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }

    public void methodTwo(){
        try {
            lock.lock();
            System.out.println("methodTwo begin ThreadName = " + Thread.currentThread().getName() + " time = " + System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println("methodTwo end ThreadName = " + Thread.currentThread().getName() + " time = " + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }
}
