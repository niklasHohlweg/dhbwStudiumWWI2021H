package threading_exercise_2_niklas;

public class Main {

    public static void main(String[] args) {


        long lowerBound1 = 0;
        long upperBound1 = 10000000;

        long lowerBound2 = 10000001;
        long upperBound2 = 20000000;

        long result;
        long timeStart;
        long timeEnd;
        long time;
        double timeKomma;

        timeStart = System.nanoTime();

        Counter myCounter1 = new Counter(lowerBound1, upperBound1);
        Counter myCounter2 = new Counter(lowerBound2, upperBound2);

        Thread myThreadCounter1 = new Thread(myCounter1);
        Thread myThreadCounter2 = new Thread(myCounter2);

        myThreadCounter1.start();
        myThreadCounter2.start();

        try {

            myThreadCounter1.join();

        }
        catch (InterruptedException e) {

            e.printStackTrace();

        }


        try {

            myThreadCounter2.join();

        } catch (InterruptedException e) {

            e.printStackTrace();

        }

        result = myCounter1.result + myCounter2.result;

        timeEnd = System.nanoTime();

        time = timeEnd - timeStart;
        timeKomma = time;

        System.out.println("Das Ergebnis ist: " + result);
        System.out.println("");
        System.out.println("Die Berechnung hat gedauert (in nano Sec.): " + time);
        System.out.println("Die Berechnung hat gedauert (in ms.): " + timeKomma / 1000000);
        System.out.println("Die Berechnung hat gedauert (in Sec.) " + (timeKomma / 1000000000));


    }

}
