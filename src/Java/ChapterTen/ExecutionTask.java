package Java.ChapterTen;

import java.util.concurrent.*;

public class ExecutionTask {

    private final ConcurrentMap<Object, Future<String>> taskCahe = new ConcurrentHashMap<>();

    private String executionTask(final String taskName){
        while (true){
            Future<String> future = taskCahe.get(taskName);
            if (future == null){
                Callable<String> task = new Callable<String>() {
                    @Override
                    public String call() throws Exception {
                        return taskName;
                    }
                };

                FutureTask<String> futureTask = new FutureTask<String>(task);
                future = taskCahe.putIfAbsent(taskName, futureTask);
                if (future == null){
                    future = futureTask;
                    futureTask.run();
                }
            }

            try {
                return future.get();
            }catch (CancellationException | InterruptedException | ExecutionException e){
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {

    }
}
