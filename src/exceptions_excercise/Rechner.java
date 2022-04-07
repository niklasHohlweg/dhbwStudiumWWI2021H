package exceptions_excercise;

public class Rechner {

    public int multiply(String a, String b) throws RechnerException{
        try{
        int op1 = Integer.parseInt(a);
        int op2 = Integer.parseInt(b);
        int erg = op1 * op2;
        return erg;}
        catch(NumberFormatException e){
            throw new RechnerException("multiplication");
        }
    }

    public double divide(String a, String b) throws RechnerException{
        try{
        double op1 = Double.parseDouble(a);
        double op2 = Double.parseDouble(b);
        double erg = op1 / op2;
        return erg;
        }
        catch(NumberFormatException e){
            throw new RechnerException("division");
        }
    }

    public int add(String a, String b) throws RechnerException{
        try {
            int op1 = Integer.parseInt(a);
            int op2 = Integer.parseInt(b);
            int erg = op1 + op2;
            return erg;
        }
        catch(NumberFormatException e){
            throw new RechnerException("addition");
        }
    }

    public int subtract(String a, String b) throws RechnerException{
        try {
            int op1 = Integer.parseInt(a);
            int op2 = Integer.parseInt(b);
            int erg = op1 - op2;
            return erg;
        }
        catch(NumberFormatException e){
            throw new RechnerException("subtract");
        }

    }

}
