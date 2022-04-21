package threading_exercise_3_Niklas;

public class Object implements Runnable{

    Counter myCounter;

    public Object(Counter myCounter){

        this.myCounter = myCounter;

    }

    @Override
    public void run() {

        for (int i = 0; i < 100000; i++){

            this.myCounter.increment();

        }

    }
}
