package homework2;

public class Fraction {
    private final long numerator;
    private final short denominator;

    public Fraction(long numerator, short denominator) {
        if (denominator == 0)
            throw new IllegalArgumentException("Denominator can`t be equal to zero!");

        if (denominator < 0) {
            this.numerator = -numerator;
            this.denominator = (short) -denominator;
        } else {
            this.numerator = numerator;
            this.denominator = denominator;
        }

    }

    public Fraction add(Fraction fraction) {
        long resultNumerator = this.numerator * fraction.denominator + this.denominator * fraction.numerator;
        short resultDenominator = (short) (this.denominator * fraction.denominator);
        return new Fraction(resultNumerator, resultDenominator);
    }

    public Fraction sub(Fraction fraction) {
        long resultNumerator = this.numerator * fraction.denominator - this.denominator * fraction.numerator;
        short resultDenominator = (short) (this.denominator * fraction.denominator);
        return new Fraction(resultNumerator, resultDenominator);
    }

    public Fraction mul(Fraction fraction) {
        long resultNumerator = this.numerator * fraction.numerator;
        short resultDenominator = (short) (this.denominator * fraction.denominator);
        return new Fraction(resultNumerator, resultDenominator);
    }

    public Fraction div(Fraction fraction) {
        long resultNumerator = this.numerator * fraction.denominator;
        short resultDenominator = (short) (this.denominator * fraction.numerator);
        return new Fraction(resultNumerator, resultDenominator);
    }

    public boolean isEqual(Fraction fraction) {
        return (this.numerator == fraction.numerator && this.denominator == fraction.denominator);
    }

    public boolean isHigher(Fraction fraction) {
        return ((double) this.numerator / this.denominator > (double) fraction.numerator / fraction.denominator);
    }

    public boolean isHigherOrEqual(Fraction fraction) {
        return ((double) this.numerator / this.denominator >= (double) fraction.numerator / fraction.denominator);
    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }
}
