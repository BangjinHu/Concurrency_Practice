package Java.ChapterThree.TwoThreadTransDataImpl;

public class TwoThreadTransDataValidate {
    public static void main(String[] args) {
        MyList service = new MyList();
        ThreadA threadA = new ThreadA(service);
        threadA.setName("a");
        threadA.start();

        ThreadB threadB = new ThreadB(service);
        threadB.setName("b");
        threadB.start();
    }
}
