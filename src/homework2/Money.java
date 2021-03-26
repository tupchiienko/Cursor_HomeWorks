package homework2;

public class Money {
    private final long hryvnias;
    private final byte kopecks;

    public Money(long hryvnias, byte kopecks) {
        if (kopecks < 0 || hryvnias < 0)
            throw new IllegalArgumentException("Money values can`t be negative.");
        if (kopecks == 100) {
            hryvnias++;
            kopecks = 0;
        }
        this.hryvnias = hryvnias;
        this.kopecks = kopecks;
    }

    public Money add(Money money) {
        long resultHryvnias = this.hryvnias + money.hryvnias;
        int resultKopecks = this.kopecks + money.kopecks;
        if (resultKopecks > 100) {
            resultHryvnias++;
            resultKopecks -= 100;
        }
        return new Money(resultHryvnias, (byte) resultKopecks);
    }

    public Money subtract(Money money) {
        if (!isHigherOrEqual(money))
            throw new IllegalArgumentException("The second object must be less than or equal to the first");
        long resultHryvnias = this.hryvnias - money.hryvnias;
        int resultKopecks = this.kopecks - money.kopecks;
        if (resultKopecks < 0) {
            resultKopecks = 100 + resultKopecks;
            resultHryvnias--;
        }
        return new Money(resultHryvnias, (byte) resultKopecks);
    }

    public Money divide(Money money) {
        return this.divideToDouble(money.toDouble());
    }

    public Money multiply(Money money) {
        return this.multiplyToDouble(money.toDouble());
    }

    public Money divideToDouble(double number) {
        if (number < 0)
            throw new IllegalArgumentException("Number must be positive.");
        double money = this.toDouble();
        return doubleToMoney(money / number);
    }

    public Money multiplyToDouble(double number) {
        if (number < 0)
            throw new IllegalArgumentException("Number must be positive.");
        double money = this.toDouble();
        return doubleToMoney(money * number);
    }

    public boolean isHigher(Money money) {
        return this.toDouble() > money.toDouble();
    }

    public boolean isHigherOrEqual(Money money) {
        return this.toDouble() >= money.toDouble();
    }

    private double toDouble() {
        return (this.hryvnias * 100 + this.kopecks) / 100d;
    }

    private Money doubleToMoney(double num) {
        long hryvnias = (long) num;
        byte kopecks = (byte) ((num - hryvnias) * 100);
        return new Money(hryvnias, kopecks);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Money) {
            Money secondMoney = (Money) obj;
            return this.hryvnias == secondMoney.hryvnias && this.kopecks == secondMoney.kopecks;
        }
        return false;
    }

    @Override
    public String toString() {
        return hryvnias + "," + kopecks;
    }
}
