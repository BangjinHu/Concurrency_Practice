package Java.ChapterOne;

public class ConcurrencyOne {
    private static final long count = 10000l;

    public static void main(String[] args) throws InterruptedException {
        concurrency();
        serial();
    }

    public static void concurrency() throws InterruptedException {
        long start = System.currentTimeMillis();
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                int a = 0;
                for (long i = 0; i < count; i++){
                    a += 5;
                }
            }
        });

        thread.start();
        int b = 0;
        for (long i = 0; i < count; i++){
            b--;
        }

        long time = System.currentTimeMillis() - start;
        thread.join();
        System.out.println("并行：" + time + "ms, b=" + b);

    }

    private static void serial(){
        long start = System.currentTimeMillis();
        int a = 0;
        for (long i = 0; i < count; i++){
            a += 5;
        }

        int b = 0;
        for (long i = 0; i < count; i++){
            b--;
        }
        long time = System.currentTimeMillis();
        System.out.println("串行：" + time + "ms,b=" + b + " a=" + a);
    }
}
