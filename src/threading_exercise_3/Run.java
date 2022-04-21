package threading_exercise_3;

public class Run implements Runnable {
    private Counter myCounter;

    @Override
    public void run() {
        for (int i = 0; i < 100000; i++) {
            myCounter.increment();
        }

    }

    public Run(Counter pCouner) {
        myCounter = pCouner;
    }
}
