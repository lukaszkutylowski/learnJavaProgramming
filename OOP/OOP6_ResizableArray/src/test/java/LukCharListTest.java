import static org.junit.Assert.*;
import org.junit.Test;

public class LukCharListTest {

    @Test
    public void should_check_save_char() {
        //given
        final LukCharList lukCharList = new LukCharList();
        final int expectedIntPosition = 0;
        //when
        final int actualIntPosition = lukCharList.save('5');
        //then
        assertEquals(actualIntPosition,expectedIntPosition);
    }

    @Test
    public void should_check_index_value() {
        //given
        final LukCharList lukCharList = new LukCharList();
        lukCharList.save('5');
        final char expectedChar = '5';
        //when
        final char actualChar = lukCharList.getByIndex(0);
        //then
        assertEquals(actualChar, expectedChar);
    }

    @Test
    public void should_check_all_array() {
        //given
        final LukCharList lukCharList = new LukCharList();
        lukCharList.save('5');
        final char[] expectedCharArray = {'5'};
        //when
        final char[] actualCharArray = lukCharList.getAll();
        //then
        assertArrayEquals(expectedCharArray, actualCharArray);
    }

    @Test
    public void should_check_deleted_char() {
        //given
        final LukCharList lukCharList = new LukCharList();
        final char expectedChar = '5';
        lukCharList.save('5');
        //when
        final char actualChar = lukCharList.delete(0);
        //then
        assertEquals(expectedChar, actualChar);
    }

    @Test
    public void should_check_array_length() {
        //given
        final LukCharList lukCharList = new LukCharList();
        final int expectedInt = 1;
        lukCharList.save('5');
        //when
        final int actualInt = lukCharList.length();
        assertEquals(expectedInt, actualInt);
    }
}