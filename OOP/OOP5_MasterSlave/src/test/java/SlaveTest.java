import org.junit.Test;

import static org.junit.Assert.*;

public class SlaveTest {

    @Test
    public void sholud_check_variable_value() {
        //given
        final Slave slave = new Slave();
        final String expectedString = "slave";
        //when
        final String actualMessage = slave.getName();
        //then
        assertEquals(actualMessage, expectedString);
    }

    @Test
    public void getMessage() {
        //given
        final Slave slave = new Slave();
        final String expectedValue = "message from slave! ";
        //when
        final String actualValue = slave.getMessage();
        //then
        assertEquals(actualValue, expectedValue);
    }
}