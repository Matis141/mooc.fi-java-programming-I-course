
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

    public Money plus(Money addition) {
        Money newMoney = new Money(this.euros + addition.euros, this.cents + addition.cents);
        return newMoney;
    }
    
    public boolean lessThan(Money compared) {
        if (this.euros < compared.euros) {
            return true;
        } else if (this.euros == compared.euros && this.cents < compared.cents) {
            return true;
        }
        return false;
    }
    
    public Money minus(Money decreaser) {
        
        int diffCents = this.cents - decreaser.cents;
        int diffEuros = 0;
        
        if (diffCents < 0) {
            diffEuros = this.euros - decreaser.euros - 1;
            diffCents = 100 + diffCents;
        } else {
            diffEuros = this.euros - decreaser.euros;
        }
        if (diffEuros < 0) {
            Money newMoney = new Money(0, 0);
            return newMoney;
        }
        Money newMoney = new Money(diffEuros, diffCents);
        return newMoney;
    }
    
}
