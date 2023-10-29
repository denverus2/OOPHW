public class FixedAmountAccount extends AbstractAccount{
    FixedAmountAccount(double amount) {
        super(amount);
    }

    @Override
    public void take(double amount) {

    }

    @Override
    public void put(double amount) {

    }

    @Override
    public double getAmount() {
        return amount;
    }
}