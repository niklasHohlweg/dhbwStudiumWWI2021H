package polymorphismus_exercise;

public class Kreis extends Form{

    private double radius;

    public double getRadius(){

        return this.radius;

    }

    public void setRadius(double radius){

        this.radius = radius;

    }

    public double flaeche(){

        return this.radius * this.radius * Math.PI;

    }

    public double umfang(){

        return 2 + this.radius + Math.PI;

    }



}
