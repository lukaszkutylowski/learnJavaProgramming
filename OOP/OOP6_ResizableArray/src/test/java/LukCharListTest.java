import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class LukCharListTest {

    private LukCharList lukCharList;

    @Before
    public void initialize() {
        lukCharList = new LukCharList();
    }

    @Test
    public void should_check_save_char() {
        //given
        final int expectedIntPosition = 0;
        //when
        final int actualIntPosition = lukCharList.save('5');
        //then
        assertEquals(actualIntPosition,expectedIntPosition);
    }

    @Test
    public void should_check_index_value() {
        //given
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
        final int expectedInt = 1;
        lukCharList.save('5');
        //when
        final int actualInt = lukCharList.length();
        //then
        assertEquals(expectedInt, actualInt);
    }

    @Test
    public void should_check_counting_chars_in_array() {
        //given
        final int expectedNumber = 1;
        lukCharList.save('!');
        lukCharList.save('?');
        //when
        final int actualNumber = lukCharList.countChar('!');
        //then
        assertEquals(expectedNumber, actualNumber);
    }
}