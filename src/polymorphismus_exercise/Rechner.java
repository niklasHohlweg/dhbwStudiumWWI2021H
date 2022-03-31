package polymorphismus_exercise;

public class Rechner {

    private Form[] formen = new Form [10];
    private int counter = 0;


    public void setArray(Form pFormen){

        formen[counter] = pFormen;
        counter += 1;

    }

    public void printFlaechen(){

        for(Form elem : formen){

            System.out.println("Die Flaeche beträgt: " + elem.flaeche());

        }

    }

    public void printUmfang(){

        for(Form elem : formen){

            System.out.println("Der  Umfang beträgt: " + elem.umfang());

        }

    }

    public void printFarben(){

        for(Form elem : formen){

            System.out.println("Die Farbe ist: " + elem.getFarbe());

        }

    }


}