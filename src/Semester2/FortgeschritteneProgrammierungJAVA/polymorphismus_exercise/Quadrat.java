package polymorphismus_exercise;

public class Quadrat extends Form{

    private double kantenLaenge;

    public double getKantenLaenge(){

        return this.kantenLaenge;

    }

    public void setKantenLaenge(double kantenLaenge){

        this.kantenLaenge = kantenLaenge;

    }


    public double flaeche() {

        return kantenLaenge * kantenLaenge;

    }

    public double umfang() {

        return kantenLaenge * 4;

    }
}
