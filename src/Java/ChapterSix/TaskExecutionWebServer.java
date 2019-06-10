package Java.ChapterSix;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

//基于Executor框架的web服务器
public class TaskExecutionWebServer {
    private static final int NTHREADS = 100;
    //标准Executor实现，固定长度的线程池
    private static final Executor exec = Executors.newFixedThreadPool(NTHREADS);

//    public static void main(String[] args) throws IOException {
//        ServerSocket socket = new ServerSocket(80);
//
//        while (true){
//            final Socket connection = socket.accept();
//            Runnable task = new Runnable() {
//                @Override
//                public void run() {
//                    handleRequest(connection);
//                }
//            };
//            exec.execute(task);
//        }
//
//    }
//
//    public void handleRequest(Socket connection){
//        Request request = readRequest(connection);
//        if (isShutdownRequest(request)){
//            stop();
//        }
//    }



}
