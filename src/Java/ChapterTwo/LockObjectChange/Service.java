package Java.ChapterTwo.LockObjectChange;
//锁对象的改变
public class Service {

    private String lock = "123";
    public void method(){
        try {
            synchronized (lock){
                System.out.println(Thread.currentThread().getName() + "begin" + System.currentTimeMillis());
                lock = "456";
                Thread.sleep(3000);
                System.out.println(Thread.currentThread().getName() + "end" + System.currentTimeMillis());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
