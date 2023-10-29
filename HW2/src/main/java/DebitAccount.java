public class DebitAccount extends AbstractAccount implements Account {
    DebitAccount(double amount) {
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
        return 0;
    }
}