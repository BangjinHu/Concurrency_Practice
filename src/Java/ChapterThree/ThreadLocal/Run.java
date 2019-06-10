package Java.ChapterThree.ThreadLocal;

public class Run {

    public static ThreadLocal threadLocal = new ThreadLocal();

    public static void main(String[] args) {
        if (threadLocal.get() == null){
            System.out.println("没有值");
            threadLocal.set("线程1值");
        }

        System.out.println(threadLocal.get());
        System.out.println(threadLocal.get());
    }
}
