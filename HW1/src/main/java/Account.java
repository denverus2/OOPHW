public class Account {
    private double balance;

    public void put(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void take(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
        }
    }

    public double getAmount() {
        return balance;
    }
}

class CreditAccount extends Account {
    @Override
    public void take(double amount) {

        super.take(amount * 1.01);
    }
}

class DepositAccount extends Account {
    private long lastWithdrawalTime = System.currentTimeMillis();

    @Override
    public void take(double amount) {
        long currentTime = System.currentTimeMillis();
        if (amount > 0 && getAmount() >= amount && currentTime - lastWithdrawalTime >= 30L * 24 * 60 * 60 * 1000) {
            super.take(amount);
            lastWithdrawalTime = currentTime;
        }
    }

}







