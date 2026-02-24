package Projects.Fractions;

public class NullDenominatorException extends RuntimeException{

    public NullDenominatorException() {
        super("Denominator cannot be zero.");
    }
}
