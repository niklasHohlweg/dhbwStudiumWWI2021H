package exceptions_excercise;

public class Rechner {

    public int multiply(String a, String b){

        int op1 = Integer.parseInt(a);
        int op2 = Integer.parseInt(b);

        int erg = op1 * op2;

        return erg;

    }

    public double divide(String a, String b){

        double op1 = Double.parseDouble(a);
        double op2 = Double.parseDouble(b);

        double erg = op1 / op2;

        return erg;

    }

    public int add(String a, String b){

        int op1 = Integer.parseInt(a);
        int op2 = Integer.parseInt(b);

        int erg = op1 + op2;

        return erg;

    }

    public int subtract(String a, String b){

        int op1 = Integer.parseInt(a);
        int op2 = Integer.parseInt(b);

        int erg = op1 - op2;

        return erg;

    }

}
