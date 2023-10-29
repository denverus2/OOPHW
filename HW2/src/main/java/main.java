public class main {
    public static void main(String[] args) {
        CreditAccount acc2 = new CreditAccount(600);
        acc2.take(450);
        System.out.println(acc2.getAmount());
    }
}
