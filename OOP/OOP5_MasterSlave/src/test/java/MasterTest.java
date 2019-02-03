import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MasterTest {

    @Test
    public void should_check_hardcoded_message() {
        //given
        final Master master = new Master();
        final String expectedString = "hardcored text from master";
        //when
        final String actualMessage = master.getMessage();
        //then
        assertEquals(actualMessage, expectedString);
    }

    @Test
    public void should_check_variable_value() {
        //given
        final Master master = new Master();
        final String expectedString = "master";
        //when
        final String actualValue = master.name;
        //then
        assertEquals(expectedString, actualValue);
    }
}