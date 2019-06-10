package Java.ChapterTwo.DeadLock;

public class DeadThread implements Runnable {

    public String username;
    public Object lockOne = new Object();
    public Object lockTwo = new Object();

    public void setFlag(String username){
        this.username = username;
    }
    @Override
    public void run() {
        if (username.equals("a")) {
            synchronized (lockOne) {
                try {
                    System.out.println("username=" + username);
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            synchronized (lockTwo) {
                System.out.println("根据lockOne到lockTwo的顺序执行...");
            }
        }

        if (username.equals("b")){
            synchronized (lockTwo){
                try {
                    System.out.println("username=" + username);
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            synchronized (lockOne){
                System.out.println("根据lockTwo到lockOne的顺序执行...");
            }
        }
    }
}
