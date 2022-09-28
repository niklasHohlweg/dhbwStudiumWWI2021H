package polymorphismus_exercise;

public abstract class Form {

    private String farbe;

    public String getFarbe(){

        return this.farbe;

    }

    public void setFarbe (String farbe){

        this.farbe = farbe;

    }

    public abstract double flaeche();

    public abstract double umfang();

}
