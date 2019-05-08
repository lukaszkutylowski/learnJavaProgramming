import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

public class ATMTest {

    @Test
    public void shouldCheckWithdrawCash() {
        //given
        CreditCard card = new CreditCard();
//        DataBase base = mock(DataBase.class);
        DataBase base = new DataBase();
        ATM atm = new ATM(card, base);
        int howMuchTest = 200;
        int howShouldGet = 210;
        //when
        int actualTransaction = atm.getMoney(card, howMuchTest);
        //then
        assertEquals(howShouldGet, actualTransaction);
    }
}