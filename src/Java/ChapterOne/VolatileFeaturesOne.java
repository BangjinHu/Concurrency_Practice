package Java.ChapterOne;

public class VolatileFeaturesOne {

    volatile long vl = 0L;
    public void set(long l){
        vl = l;
    }

    public void getAndIncrement(){
        vl++;
    }

    public long get(){
        return vl;
    }

    //这里假设有多个线程分别调用三个方法

}
