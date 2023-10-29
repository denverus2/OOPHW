public class CreditAccount extends AbstractAccount implements Account {

    CreditAccount(double amount) {
        super(amount);
    }

    @Override
    public void take(double amount) {

       this.amount=this.amount-(amount*1.01);
    }

    @Override
    public void put(double amount) {

    }

    @Override
    public double getAmount() {
        return amount;
    }


}
