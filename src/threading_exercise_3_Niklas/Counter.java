package threading_exercise_3_Niklas;

public class Counter {

    public int counter = 0;

    public synchronized void increment(){

        counter += 1;

    }

}
