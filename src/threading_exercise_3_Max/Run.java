package threading_exercise_3_Max;

public class Run implements Runnable {
    private Counter myCounter;

    @Override
    public void run() {
        for (int i = 0; i < 100000; i++) {
            myCounter.increment();
        }
    }

    public Run(Counter pCounter) {
        myCounter = pCounter;
    }
}
