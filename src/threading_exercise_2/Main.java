package threading_exercise_2;

public class Main {

    public static void main(String[] args) {
        long total ;
        long timeStart =System.nanoTime();
        Counter counterOne = new Counter(0,1000000000);
        Counter counterTwo = new Counter(1000000001,2000000000);
        Thread t1 = new Thread(counterOne);
        Thread t2 = new Thread(counterTwo);
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        total = counterOne.erg+counterTwo.erg;
        System.out.println(total);
        double duration = (System.nanoTime()-timeStart)/1000000;
        System.out.println(duration);
    }
}
