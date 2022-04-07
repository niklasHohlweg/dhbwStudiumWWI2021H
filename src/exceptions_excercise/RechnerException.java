package exceptions_excercise;

public class RechnerException extends Exception{
    private String arithmetrischeOperation;
    public RechnerException(String pArithmetrischeOperation){
        super();
        this.arithmetrischeOperation = pArithmetrischeOperation;
    }
    public RechnerException(String pArithmetrischeOperation,String pFehlermeldung){
        super(pFehlermeldung);
        this.arithmetrischeOperation = pArithmetrischeOperation;
    }
    public String getOperation(){
        switch(arithmetrischeOperation){
            case "add ":
                return "Operation Addition";
            case "subtract":
                return"Operation Subtrahieren";
            case "multiplication":
                return"Operation Multiplikation";
            case "division":
                return" Operation Division";
            default:
                return "Fehlende Operation";
        }
    }
}
