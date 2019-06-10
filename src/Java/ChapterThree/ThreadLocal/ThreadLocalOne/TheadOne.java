package Java.ChapterThree.ThreadLocal.ThreadLocalOne;

public class TheadOne extends Thread {

    @Override
    public void run(){
        try {
            for (int i = 0; i < 100; i++){
                Tools.threadLocal.set("theadOne" + (i + 1));
                System.out.println("threadOne get value = " + Tools.threadLocal.get());
                Thread.sleep(2000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
