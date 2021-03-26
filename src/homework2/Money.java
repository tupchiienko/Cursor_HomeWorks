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

    public Money sub(Money money) {
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

    public Money div(Money money) {
        return this.divToDouble(money.toDouble());
    }

    public Money mul(Money money) {
        return this.mulToDouble(money.toDouble());
    }

    public Money divToDouble(double number) {
        if (number < 0)
            throw new IllegalArgumentException("Number must be positive.");
        double money = this.toDouble();
        return doubleToMoney(money / number);
    }

    public Money mulToDouble(double number) {
        if (number < 0)
            throw new IllegalArgumentException("Number must be positive.");
        double money = this.toDouble();
        return doubleToMoney(money * number);
    }

    public boolean isEqual(Money money) {
        return (this.hryvnias == money.hryvnias && this.kopecks == money.kopecks);
    }

    public boolean isHigher(Money money) {
        return this.toDouble() > this.toDouble();
    }

    public boolean isHigherOrEqual(Money money) {
        return this.toDouble() >= this.toDouble();
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
    public String toString() {
        return hryvnias + "," + kopecks;
    }
}
