package exceptions_excercise;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Rechner myRechner = new Rechner();
        Scanner myScanner = new Scanner(System.in);
        try{
            System.out.println("Edit");
            System.out.println("Bitte gib eine Zahl ein:");
            String op1 = myScanner.nextLine();
            System.out.println("Bitte gib eine zweite Zahl ein:");
            String op2 = myScanner.nextLine();
            System.out.println("Adition: ");
            System.out.println("Das Ergebnis ist: " + myRechner.add(op1, op2));
            System.out.println("Subtraktion: ");
            System.out.println("Das Ergebnis ist: " + myRechner.subtract(op1, op2));
            System.out.println("Multiplikation: ");
            System.out.println("Das Ergebnis ist: " + myRechner.multiply(op1, op2));
            System.out.println("Division: ");
            System.out.println("Das Ergebnis ist: " + myRechner.divide(op1, op2));
        }
        catch (RechnerException e){
            System.out.println(e.getOperation());
        }
    }
}
