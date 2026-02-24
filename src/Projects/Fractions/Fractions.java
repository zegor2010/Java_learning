package Projects.Fractions;

public class Fractions {

    private final int numerator;
    private final int denominator;

    public Fractions(int numerator, int denominator)  throws NullDenominatorException{

        if (denominator == 0) {
            throw new NullDenominatorException();
        }

        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int getNumerator() {
        return numerator;
    }
    public int getDenominator() {
        return denominator;
    }
}

