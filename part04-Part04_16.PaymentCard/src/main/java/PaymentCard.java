public class PaymentCard {
    private double balance;
    private final double MAX_BALANCE = 150.0;

    public PaymentCard(double openingBalance) {
        this.balance = openingBalance;
    }

    public void eatAffordably() {
        if (this.balance >= 2.60) {
            this.balance -= 2.60;
        }
    }

    public void eatHeartily() {
        if (this.balance >= 4.60) {
            this.balance -= 4.60;
        }
    }

    public void addMoney(double amount) {
        if (amount > 0) {
            this.balance += amount;
            if (this.balance > MAX_BALANCE) {
                this.balance = MAX_BALANCE;
            }
        }
    }

    public String toString() {
        return "The card has a balance of " + balance + " euros";
    }
}