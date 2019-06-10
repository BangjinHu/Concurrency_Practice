package Java.ChapterOne;
//数据不共享
public class ThreadThree extends Thread {
    private int count = 5;

    public ThreadThree(String name) {
        super(name);
        this.setName(name);
    }

    @Override
    public void run(){
        super.run();
        while (count > 0){
            count--;
            System.out.println("由" + this.currentThread().getName() + "计算，count = " + count);
        }
    }
}
