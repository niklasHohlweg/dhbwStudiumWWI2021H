package threading_exercise_3_Max;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        Counter myCounter = new Counter();
        Run myRun = new Run(myCounter);
        ExecutorService exec = Executors.newCachedThreadPool();
        exec.execute(myRun);
        exec.execute(myRun);
        exec.execute(myRun);
        exec.execute(myRun);
        exec.execute(myRun);
        exec.shutdown();
        try {
            exec.awaitTermination(1, TimeUnit.DAYS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(myCounter.getCounter());
    }
}
