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
        lukCharList.save('1');
        lukCharList.save('2');
        final char[] expectedCharArray = {'1','2'};
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

    @Test
    public void should_check_first_index_of_given_char() {
        //given
        final int expectedIndex = 1;
        lukCharList.save('a');
        lukCharList.save('b');
        lukCharList.save('c');
        lukCharList.save('d');
        //when
        final int actualIndex = lukCharList.findFirst('b');
        //then
        assertEquals(expectedIndex, actualIndex);
    }

    @Test
    public void should_check_last_index_of_given_char() {
        //given
        final int expectedIndex = 2;
        lukCharList.save('a');
        lukCharList.save('b');
        lukCharList.save('c');
        lukCharList.save('d');
        //then
        final int actualIndex = lukCharList.findLast('c');
        //when
        assertEquals(expectedIndex, actualIndex);
    }

    @Test
    public void should_find_all_indexes_for_given_char() {
        //given
        final int[] expectedIndexes = {0,2};
        lukCharList.save('a');
        lukCharList.save('b');
        lukCharList.save('a');
        lukCharList.save('b');
        //then
        final int[] actualIndexes = lukCharList.findAllIndex('a');
        //when
        assertArrayEquals(expectedIndexes, actualIndexes);
    }
}