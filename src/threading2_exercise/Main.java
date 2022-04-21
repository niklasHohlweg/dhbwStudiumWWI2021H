package threading2_exercise;

public class Main {

    public static void main(String[] args) {

        int lowerBound = 0;
        int upperBound = 20000000;
        int erg = 0;
        int result;

        Counter myCounter = new Counter(lowerBound, upperBound);



        Thread myThreadCounter1 = new Thread(myCounter);
        Thread myThreadCounter2 = new Thread(myCounter);

        myThreadCounter1.start();
        myThreadCounter2.start();

        try {
            myThreadCounter1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            myThreadCounter2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        result = myThreadCounter1.result() + myThreadCounter2.result();


    }

}
