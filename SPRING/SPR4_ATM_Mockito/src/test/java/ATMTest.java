import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ATMTest {

    @Test
    public void shouldCheckWithdrawCash() {
        //given
        CreditCard card = mock(CreditCard.class);
        DataBase base = mock(DataBase.class);
        ATM atm = new ATM(card, base);
        int howMuchTest = 200;
        int howShouldGet = 210;
        //when
        when(base.saveChangeAndGetMoney(howMuchTest)).thenReturn(210);
        when(card.getID()).thenReturn(334455);
        when(card.getPassword()).thenReturn(1234);
        int actualTransaction = atm.getMoney(card, howMuchTest);
        //then
        assertEquals(howShouldGet, actualTransaction);
    }
}