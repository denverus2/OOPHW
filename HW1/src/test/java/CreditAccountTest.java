import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreditAccountTest {

    @Test
    void take() {
        CreditAccount creditAccount = new CreditAccount();
        creditAccount.put(300);
        creditAccount.take(200);
        double actualPut = creditAccount.getAmount();
        double expectedPut = 98;
        Assertions.assertEquals(expectedPut, actualPut);
    }
}