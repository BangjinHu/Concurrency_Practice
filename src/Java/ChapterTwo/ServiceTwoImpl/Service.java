package Java.ChapterTwo.ServiceTwoImpl;

public class Service {
    Object objectOne = new Object();

    public void methodA(){
        synchronized (objectOne){
            System.out.println("methodA begin");
            boolean isContinueRun = true;
            //如果两者都是synchronize的话，这里进入死循环之后没有释放锁，然后使用同步块来解决问题，两个锁
            while (isContinueRun){

            }
            System.out.println("methodA end");
        }
    }

    Object objectTwo = new Object();
    public void methodB(){
        synchronized (objectTwo){
            System.out.println("methodB begin");
            System.out.println("methodB end");
        }
    }
}
