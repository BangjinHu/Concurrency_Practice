package Java.ChapterOne;
//判断当前线程是否处于活动状态
public class ThreadSix extends Thread {

    @Override
    public void run(){
        System.out.println("run = " + this.isAlive());
    }


}
