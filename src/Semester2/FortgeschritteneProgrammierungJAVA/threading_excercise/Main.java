package threading_excercise;

public class Main {

    public static void main(String[] args) {

        Zähler myZählerEins = new Zähler();
        Zähler myZählerZwei = new Zähler();

        Thread myThreadOne = new Thread(myZählerEins);
        Thread myThreadTwo = new Thread(myZählerZwei);

        myZählerEins.run();
        myZählerZwei.run();

        myThreadOne.run();
        myThreadTwo.run();

        myThreadOne.start();
        myThreadTwo.start();

    }

}
