package Java.ChapterOne;
//线程的随机性
public class ThreadTwo extends Thread {

    @Override
    public void run(){
        try {
            for (int i = 0; i < 10; i++){
                int time = (int) (Math.random() * 1000);
                Thread.sleep(time);
                System.out.println("run = " + Thread.currentThread().getName());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
