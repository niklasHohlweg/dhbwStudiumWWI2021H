package threading_exercise_3_Max;

public class Counter {
    private int counter =0;
    public synchronized void increment(){
        counter++;
    }
    public int getCounter(){return counter;}
}
