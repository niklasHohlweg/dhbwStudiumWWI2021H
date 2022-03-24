import java.util.Scanner;

public class exerScanner {

    public void Method(){

        Scanner myScanner = new Scanner(System.in);

        System.out.println("Bitte gib eine Zahl ein:");
        int Op1 = myScanner.nextInt();

        System.out.println("Bitte gib eine zweite Zahl ein:");
        int Op2 = myScanner.nextInt();

        System.out.println("Dein Ergebnis ist: " + (Op1 + Op2));

    }

}
