package Thread_Excercise;

public class Main {
    public static void main(String[] args) {
        Counter counterOne = new Counter();
        Counter counterTwo = new Counter();
        Thread threadOne = new Thread(counterOne);
        Thread threadTwo = new Thread(counterTwo);
        counterOne.run();
        counterTwo.run();
        threadOne.run();
        threadTwo.run();
        threadOne.start();
        threadTwo.start();
    }
}
