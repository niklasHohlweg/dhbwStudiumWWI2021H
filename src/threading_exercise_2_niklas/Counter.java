package threading_exercise_2_niklas;

public class Counter implements Runnable{

    private long lowerBound;
    private long upperBound;
    public long result;

    public Counter(long lowerBound, long upperBound){

        this.lowerBound = lowerBound;
        this.upperBound = upperBound;

    }


    @Override
    public void run() {


        for(int i = 0; i <= upperBound - lowerBound; i++){

            result += (lowerBound + i);

        }

    }

}
