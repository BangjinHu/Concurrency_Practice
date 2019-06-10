package Java.ChapterOne;

public class ThreadTwoValidate {

    public static void main(String[] args) {
        try {
            ThreadTwo threadTwo = new ThreadTwo();
            threadTwo.setName("threadTwo");
            //线程准备就绪
            threadTwo.start();
            for (int i = 0; i < 10; i++){
                int time = (int) (Math.random() * 1000);
                Thread.sleep(time);
                System.out.println("main = " + Thread.currentThread().getName());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
