public class main {

    public static void main(String[] args) {
        Account acc1=new Account();
        acc1.put(2200);
        System.out.println(acc1.getAmount());
        acc1.take(150);
        System.out.println(acc1.getAmount());
        CreditAccount acc2=new CreditAccount();
        acc2.put(565);
        acc2.take(450);
        System.out.println(acc2.getAmount());
    }
}
