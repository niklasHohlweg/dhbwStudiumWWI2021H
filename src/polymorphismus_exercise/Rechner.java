package polymorphismus_exercise;

public class Rechner {

    private Form formen;
    private int counter = 0;

    public void printFlaechen(){



    }

    public void printUmfang(){

        System.out.println("Der Umfang beträgt " + formen.umfang());

    }

    public void printFarben(){

        System.out.println("Die Farbe ist: " + formen.getFarbe());

    }


}