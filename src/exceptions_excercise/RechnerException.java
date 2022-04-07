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
            case "addition":
                return "Fehler bei Operation Addition";
            case "subtract":
                return"Fehler bei Operation Subtrahieren";
            case "multiplication":
                return"Fehler bei Operation Multiplikation";
            case "division":
                return"Fehler bei  Operation Division";
            default:
                return "Fehlende Operation";
        }
    }
}
