import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    @org.junit.jupiter.api.Test
    void testPut() {
        Account account = new Account();
        account.put(300);
        double actualPut = account.getAmount();
        double expectedPut = 300;
        Assertions.assertEquals(expectedPut, actualPut);

    }

    @org.junit.jupiter.api.Test
    void testPut2() {
        Account account = new Account();
        account.put(-300);
        double actualPut = account.getAmount();
        double expectedPut = 0;
        Assertions.assertEquals(expectedPut, actualPut);

    }

    @org.junit.jupiter.api.Test
    void testTake() {
        Account account = new Account();
        account.put(300);
        account.take(100);
        double actualPut = account.getAmount();
        double expectedPut = 200;
        Assertions.assertEquals(expectedPut, actualPut);

    }

    @org.junit.jupiter.api.Test
    void testTake2() {
        Account account = new Account();
        account.put(300);
        account.take(400);
        double actualPut = account.getAmount();
        double expectedPut = 300;
        Assertions.assertEquals(expectedPut, actualPut);

    }


}