package Java.ChapterOne;
//测试复杂情况下调用那个哪个线程执行
public class ThreadFive extends Thread {

    public ThreadFive() {
        System.out.println("threadFive 开始");
        System.out.println("Thread.currentThread().getName() = " + Thread.currentThread().getName());
        System.out.println("this.getName = " + this.getName());
        System.out.println("threadFive 结束");
    }

    @Override
    public void run(){
        System.out.println("run 开始");
        System.out.println("Thread.currentThread().getName() = " + Thread.currentThread().getName());
        System.out.println("this.getName = " + this.getName());
        System.out.println("run 结束");
    }
}
