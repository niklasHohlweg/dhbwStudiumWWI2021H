package threading2_exercise;

public class Counter implements Runnable{

    private int lowerBound;
    private int upperBound;
    private int erg;

    public Counter(int lowerBound, int upperBound){

        this.lowerBound = lowerBound;
        this.upperBound = upperBound;

    }


    @Override
    public void run() {


        for(int i = 0; i <= upperBound - lowerBound; i++){

            erg += (lowerBound + i);

        }

    }

    public int getSum(){

        return erg;

    }
}
