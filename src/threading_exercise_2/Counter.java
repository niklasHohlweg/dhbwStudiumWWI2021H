package threading_exercise_2;

public class Counter implements Runnable {
    private final int lower;
    private final int upper;
    public long erg =0;

    @Override
    public void run() {
        for (int i = lower; i <= upper; i++) {
            erg +=i;
        }
    }
    public Counter(int pLower, int pUpper){
        this.lower = pLower;
        this.upper = pUpper;
    }
}

