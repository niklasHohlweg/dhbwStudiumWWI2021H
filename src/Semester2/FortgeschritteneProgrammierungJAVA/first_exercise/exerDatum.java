package first_exercise;

import java.util.Scanner;

public class exerDatum {

    public void Date(){

        Scanner myScanner = new Scanner(System.in);

        System.out.println("Bitte gib den Tag ein: ");
        int tag = myScanner.nextInt();

        System.out.println("Bitte gib den Monat ein: ");
        int monat = myScanner.nextInt();

        System.out.println("Bitte gib das Jahr ein: ");
        int jahr = myScanner.nextInt();

        System.out.println(" (" + tag + " " + monat + " " + jahr + ") ");

        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append(tag);
        stringBuilder.append('/');
        stringBuilder.append(monat);
        stringBuilder.append('/');
        stringBuilder.append(jahr);

        System.out.println(stringBuilder.toString());

        for(int i =0;i< stringBuilder.length();i++){

            if(stringBuilder.charAt(i)=='/') {

                stringBuilder.setCharAt(i,'.');

            }
        }

        System.out.println(stringBuilder.toString());

    }

}
