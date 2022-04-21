package threading_exercise_3_Niklas;

import java.util.concurrent.*;

public class Main {

    public static void main(String[] args) {

        Counter myCounter = new Counter();
        Object myObject = new Object(myCounter);

        ExecutorService myExecutorService = Executors.newCachedThreadPool();
        myExecutorService.execute(myObject);
        myExecutorService.execute(myObject);
        myExecutorService.execute(myObject);
        myExecutorService.execute(myObject);
        myExecutorService.execute(myObject);
        myExecutorService.shutdown();
        try {
            myExecutorService.awaitTermination(1,TimeUnit.DAYS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Ergebnis: " + myCounter.counter);


    }

}
