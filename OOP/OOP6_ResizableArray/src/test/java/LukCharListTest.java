import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class LukCharListTest {

    private LukCharList lukCharList;

    @Before
    public void initialize() {
        lukCharList = new LukCharList();
    }

    @Test
    public void should_check_save_char() {
        //given
        final int expectedIntPosition0 = 0;
        final int expectedIntPosition1 = 1;
        final int expectedIntPosition2 = 2;
        //when
        final int actualIntPosition0 = lukCharList.save('a');
        final int actualIntPosition1 = lukCharList.save('b');
        final int actualIntPosition2 = lukCharList.save('a');
        //then
        assertEquals(actualIntPosition0,expectedIntPosition0);
        assertEquals(actualIntPosition1,expectedIntPosition1);
        assertEquals(actualIntPosition2,expectedIntPosition2);
    }

    @Test
    public void should_check_save_char_by_length_index_find() {
        //given
        final char expectedChar1 = 'a';
        final char expectedChar2 = 'b';
        final char expectedChar3 = 'c';
        final int expectedLength = 3;
        final int expectedIndex1 = 0;
        final int expectedIndex2 = 1;
        final int expectedIndex3 = 2;
        //when
        lukCharList.save('a');
        lukCharList.save('b');
        lukCharList.save('c');
        final char actualChar1 = lukCharList.getByIndex(0);
        final char actualChar2 = lukCharList.getByIndex(1);
        final char actualChar3 = lukCharList.getByIndex(2);
        final int actualLength = lukCharList.length();
        final int actualLastFindIndex1 = lukCharList.findLast('a');
        final int actualLastFindIndex2 = lukCharList.findLast('b');
        final int actualLastFindIndex3 = lukCharList.findLast('c');
        //then
        assertEquals(actualChar1, expectedChar1);
        assertEquals(actualChar2, expectedChar2);
        assertEquals(actualChar3, expectedChar3);
        assertEquals(actualLength, expectedLength);
        assertEquals(actualLastFindIndex1, expectedIndex1);
        assertEquals(actualLastFindIndex2, expectedIndex2);
        assertEquals(actualLastFindIndex3, expectedIndex3);
    }

    @Test
    public void should_check_index_value() {
        //given
        lukCharList.save('a');
        final char expectedChar = 'a';
        //when
        final char actualChar = lukCharList.getByIndex(0);
        //then
        assertEquals(actualChar, expectedChar);
    }

    @Test
    public void should_check_all_array() {
        //given
        lukCharList.save('q');
        lukCharList.save('w');
        lukCharList.save('e');
        lukCharList.save('r');
        lukCharList.save('t');
        lukCharList.save('y');
        final char[] expectedCharArray = {'q','w','e','r','t','y'};
        final String expectedString = "[q,w,e,r,t,y]";
        final int expectedLength = 6;
        //when
        final char[] actualCharArray = lukCharList.getAll();
        final String actualString = lukCharList.toString();
        final int actualLength = lukCharList.getAll().length;
        //then
        assertArrayEquals(expectedCharArray, actualCharArray);
        assertEquals(expectedString, actualString);
        assertEquals(expectedLength, actualLength);
    }

    @Test
    public void should_check_all_array_when_is_empty() {
        //given
        final char[] expectedCharArray = {};
        //when
        final char[] actualCharArray = lukCharList.getAll();
        //then
        assertArrayEquals(expectedCharArray, actualCharArray);
    }

    @Test
    public void should_check_deleted_char() {
        //given
        lukCharList.save('a');
        lukCharList.save('b');
        lukCharList.save('c');
        final char[] expectedCharArray1 = {'b','c'};
        final char[] expectedCharArray2 = {'c'};
        final char[] expectedCharArray3 = {};
        final int expectedLength1 = 2;
        final int expectedLength2 = 1;
        final int expectedLength3 = 0;
        final char expectedCharB = 'b';
        final char expectedCharC = 'c';
        //when
        lukCharList.delete(0);
        final char[] actualCharArray1 = lukCharList.getAll();
        final int actualLength1 = lukCharList.getAll().length;
        final char actualChar1 = lukCharList.getByIndex(0);
        final char actualChar2 = lukCharList.getByIndex(1);
        lukCharList.delete(0);
        final char[] actualCharArray2 = lukCharList.getAll();
        final int actualLength2 = lukCharList.getAll().length;
        final char actualChar3 = lukCharList.getByIndex(0);
        lukCharList.delete(0);
        final char[] actualCharArray3 = lukCharList.getAll();
        final int actualLength3 = lukCharList.getAll().length;
        //then
        assertArrayEquals(expectedCharArray1, actualCharArray1);
        assertArrayEquals(expectedCharArray2, actualCharArray2);
        assertArrayEquals(expectedCharArray3, actualCharArray3);
        assertEquals(expectedLength1, actualLength1);
        assertEquals(expectedLength2, actualLength2);
        assertEquals(expectedLength3, actualLength3);
        assertEquals(expectedCharB, actualChar1);
        assertEquals(expectedCharC, actualChar2);
        assertEquals(expectedCharC, actualChar3);
    }

    @Test
    public void should_check_deleted_char_in_many_places() {
        //given
        lukCharList.save('a');
        lukCharList.save('b');
        lukCharList.save('c');
        lukCharList.save('d');
        lukCharList.save('e');
        lukCharList.save('f');
        lukCharList.save('g');
        lukCharList.save('h');
        lukCharList.save('i');
        lukCharList.save('j');
        final char[] expectedCharArray1 = {'a','b','c','d','e','f','g','h','i'};
        final char[] expectedCharArray2 = {'a','b','d','e','f','g','h','i'};
        final char[] expectedCharArray3 = {'b','d','e','f','g','h','i'};
        final char[] expectedCharArray4 = {'e','f','g','h','i'};
        final char[] expectedCharArray5 = {'e','g'};
        final char[] expectedCharArray6 = {};
        //when
        lukCharList.delete(9);
        final char[] actualCharArray1 = lukCharList.getAll();
        lukCharList.delete(2);
        final char[] actualCharArray2 = lukCharList.getAll();
        lukCharList.delete(0);
        final char[] actualCharArray3 = lukCharList.getAll();
        lukCharList.delete(0);
        lukCharList.delete(0);
        final char[] actualCharArray4 = lukCharList.getAll();
        lukCharList.delete(lukCharList.length() - 1);
        lukCharList.delete(lukCharList.length() - 1);
        lukCharList.delete(1);
        final char[] actualCharArray5 = lukCharList.getAll();
        lukCharList.delete(lukCharList.length() - 1);
        lukCharList.delete(lukCharList.length() - 1);
        final char[] actualCharArray6 = lukCharList.getAll();

        //then
        assertArrayEquals(expectedCharArray1, actualCharArray1);
        assertArrayEquals(expectedCharArray2, actualCharArray2);
        assertArrayEquals(expectedCharArray3, actualCharArray3);
        assertArrayEquals(expectedCharArray4, actualCharArray4);
        assertArrayEquals(expectedCharArray5, actualCharArray5);
        assertArrayEquals(expectedCharArray6, actualCharArray6);
    }

    @Test
    public void should_check_array_length() {
        //given
        final int expectedInt = 3;
        final int squareBracket = 2;
        final int commas = 2;
        final int expectedIntString = 3 + squareBracket + commas;
        lukCharList.save('a');
        lukCharList.save('b');
        lukCharList.save('c');
        //when
        final int actualInt = lukCharList.length();
        final int actualArrayLength = lukCharList.getAll().length;
        final int actualStringLength = lukCharList.toString().length();
        //then
        assertEquals(expectedInt, actualInt);
        assertEquals(expectedInt, actualArrayLength);
        assertEquals(expectedIntString, actualStringLength);
    }

    @Test
    public void should_check_array_length_when_is_empty() {
        //given
        final int expectedInt = 0;
        //when
        final int actualInt = lukCharList.length();
        //then
        assertEquals(expectedInt, actualInt);
    }

    @Test
    public void should_check_counting_chars_in_array() {
        //given
        final int expectedNumberOfA = 5;
        final int expectedNumberOfB = 2;
        final int expectedNumberOfR = 2;
        final int expectedNumberOfK = 1;
        final int expectedNumberOfD = 1;
        final int expectedNumberOfZ = 0;
        lukCharList.save('a');
        lukCharList.save('b');
        lukCharList.save('r');
        lukCharList.save('a');
        lukCharList.save('k');
        lukCharList.save('a');
        lukCharList.save('d');
        lukCharList.save('a');
        lukCharList.save('b');
        lukCharList.save('r');
        lukCharList.save('a');
        //when
        final int actualNumberOfA = lukCharList.countChar('a');
        final int actualNumberOfB = lukCharList.countChar('b');
        final int actualNumberOfR = lukCharList.countChar('r');
        final int actualNumberOfK = lukCharList.countChar('k');
        final int actualNumberOfD = lukCharList.countChar('d');
        final int actualNumberOfZ = lukCharList.countChar('z');
        //then
        assertEquals(expectedNumberOfA, actualNumberOfA);
        assertEquals(expectedNumberOfB, actualNumberOfB);
        assertEquals(expectedNumberOfR, actualNumberOfR);
        assertEquals(expectedNumberOfK, actualNumberOfK);
        assertEquals(expectedNumberOfD, actualNumberOfD);
        assertEquals(expectedNumberOfZ, actualNumberOfZ);
    }

    @Test
    public void should_check_first_index_of_given_char() {
        //given
        final int expectedIndex1 = 0;
        final int expectedIndex2 = -1;
        final int expectedIndex3 = 0;
        lukCharList.save('a');
        lukCharList.save('b');
        lukCharList.save('c');
        lukCharList.save('d');
        lukCharList.save('a');
        //when
        final int actualIndex1 = lukCharList.findFirst('a');
        final int actualIndex2 = lukCharList.findFirst('e');
        final int actualIndex3 = lukCharList.findFirst('a');
        //then
        assertEquals(expectedIndex1, actualIndex1);
        assertEquals(expectedIndex2, actualIndex2);
        assertEquals(expectedIndex3, actualIndex3);
    }

    @Test
    public void should_find_all_indexes_for_given_char() {
        //given
        final int[] expectedIndexes = {0,2};
        lukCharList.save('a');
        lukCharList.save('b');
        lukCharList.save('a');
        lukCharList.save('b');
        //when
        final int[] actualIndexes = lukCharList.findAllIndex('a');
        //then
        assertArrayEquals(expectedIndexes, actualIndexes);
    }

    @Test
    public void should_delete_all_given_char() {
        //given
        final int[] expectedIndexes = {0,2};
        lukCharList.save('a');
        lukCharList.save('b');
        lukCharList.save('a');
        lukCharList.save('b');
        //when
        final int[] actualIndexes = lukCharList.deleteKindOfChar('a');
        //then
        assertArrayEquals(expectedIndexes, actualIndexes);
    }

    @Test
    public void arrayToString() {
        //given
        final String expectedString = "[a,b,c,d]";
        lukCharList.save('a');
        lukCharList.save('b');
        lukCharList.save('c');
        lukCharList.save('d');
        //when
        final String actualString = lukCharList.toString();
        //then
        System.out.println(lukCharList.getClass());
        assertEquals(expectedString, actualString);
    }

    @Test
    public void should_check_last_index_of_given_char() {
        //given
        final int expectedIndex1 = 4;
        final int expectedIndex2 = -1;
        final int expectedIndex3 = 2;
        lukCharList.save('a');
        lukCharList.save('b');
        lukCharList.save('c');
        lukCharList.save('d');
        lukCharList.save('a');
        //when
        final int actualIndex1 = lukCharList.findLast('a');
        final int actualIndex2 = lukCharList.findLast('e');
        final int actualIndex3 = lukCharList.findLast('c');
        //then
        assertEquals(expectedIndex1, actualIndex1);
        assertEquals(expectedIndex2, actualIndex2);
        assertEquals(expectedIndex3, actualIndex3);
    }

    @Test
    public void should_check_equals() {
        LukCharList lukCharList1 = new LukCharList();

        assertFalse(lukCharList.equals(new String("sfe")));
    }
}