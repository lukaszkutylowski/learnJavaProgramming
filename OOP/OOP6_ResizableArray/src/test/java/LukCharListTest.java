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
        final int expectedIndexOfA = 0;
        final int expectedIndexOfE = -1;
        final int expectedIndexOfB = 1;
        final int expectedIndexOfC = 2;
        final char expectedGetByIndexOfA = 'a';
        final char expectedGetByIndexOfB = 'b';
        final char expectedGetByIndexOfC = 'c';
        lukCharList.save('a');
        lukCharList.save('b');
        lukCharList.save('c');
        lukCharList.save('a');
        lukCharList.save('b');
        lukCharList.save('c');
        //when
        final int actualIndexOfA = lukCharList.findFirst('a');
        final int actualIndexOfE = lukCharList.findFirst('e');
        final int actualIndexOfB = lukCharList.findFirst('b');
        final int actualIndexOfC = lukCharList.findFirst('c');
        final char actualGetByIndexOfA = lukCharList.getByIndex(lukCharList.findFirst('a'));
        final char actualGetByIndexOfB = lukCharList.getByIndex(lukCharList.findFirst('b'));
        final char actualGetByIndexOfC = lukCharList.getByIndex(lukCharList.findFirst('c'));
        //then
        assertEquals(expectedIndexOfA, actualIndexOfA);
        assertEquals(expectedIndexOfE, actualIndexOfE);
        assertEquals(expectedIndexOfB, actualIndexOfB);
        assertEquals(expectedIndexOfC, actualIndexOfC);
        assertEquals(expectedGetByIndexOfA, actualGetByIndexOfA);
        assertEquals(expectedGetByIndexOfB, actualGetByIndexOfB);
        assertEquals(expectedGetByIndexOfC, actualGetByIndexOfC);
    }

    @Test
    public void should_find_all_indexes_for_given_char() {
        //given
        final int[] expectedIndexes1 = {};
        final int[] expectedIndexes2 = {0};
        final int[] expectedIndexes3 = {0,2};
        final int[] expectedIndexes4 = {0,2,4,5,6};
        //when
        final int[] actualIndexes1 = lukCharList.findAllIndex('a');
        lukCharList.save('a');
        final int[] actualIndexes2 = lukCharList.findAllIndex('a');
        lukCharList.save('b');
        lukCharList.save('a');
        lukCharList.save('b');
        final int[] actualIndexes3 = lukCharList.findAllIndex('a');
        lukCharList.save('a');
        lukCharList.save('a');
        lukCharList.save('a');
        final int[] actualIndexes4 = lukCharList.findAllIndex('a');
        //then
        assertArrayEquals(expectedIndexes1, actualIndexes1);
        assertArrayEquals(expectedIndexes2, actualIndexes2);
        assertArrayEquals(expectedIndexes3, actualIndexes3);
        assertArrayEquals(expectedIndexes4, actualIndexes4);
    }

    @Test
    public void should_delete_all_given_char() {
        //givengi
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
        final int[] expectedDeletedIndex1 = {4};
        final char[] expectedCharArrayWithoutK = {'a','b','r','a','a','d','a','b','r','a'};
        final int expectedArrayLengthWithoutK = 10;
        final String expectedStringWithoutK = "[a,b,r,a,a,d,a,b,r,a]";

        final int[] expectedDeletedIndex2 = {5};
        final char[] expectedCharArrayWithoutD = {'a','b','r','a','a','a','b','r','a'};
        final int expectedArrayLengthWithoutD = 9;
        final String expectedStringWithoutD = "[a,b,r,a,a,a,b,r,a]";

        final int[] expectedDeletedIndex3 = {1,6};
        final char[] expectedCharArrayWithoutB = {'a','r','a','a','a','r','a'};
        final int expectedArrayLengthWithoutB = 7;
        final String expectedStringWithoutB = "[a,r,a,a,a,r,a]";

        final int[] expectedDeletedIndex4 = {1,5};
        final char[] expectedCharArrayWithoutR = {'a','a','a','a','a'};
        final int expectedArrayLengthWithoutR = 5;
        final String expectedStringWithoutR = "[a,a,a,a,a]";

        final int[] expectedDeletedIndex5 = {0,1,2,3,4};
        final char[] expectedCharArrayWithoutA = {};
        final int expectedArrayLengthWithoutA = 0;
        final String expectedStringWithoutA = "[]";
        //when
        System.out.println(lukCharList.toString());
        final int[] actualDeletedIndex1 = lukCharList.deleteKindOfChar('k');
        System.out.println(lukCharList.toString());
        final char[] actualCharArrayWithoutK = lukCharList.getAll();
        final int actualArrayLengthWithoutK = lukCharList.length();
        final String actualStringWithoutK = lukCharList.toString();

        final int[] actualDeletedIndex2 = lukCharList.deleteKindOfChar('d');
        System.out.println(lukCharList.toString());
        final char[] actualCharArrayWithoutD = lukCharList.getAll();
        final int actualArrayLengthWithoutD = lukCharList.length();
        final String actualStringWithoutD = lukCharList.toString();

        final int[] actualDeletedIndex3 = lukCharList.deleteKindOfChar('b');
        System.out.println(lukCharList.toString());
        final char[] actualCharArrayWithoutB = lukCharList.getAll();
        final int actualArrayLengthWithoutB = lukCharList.length();
        final String actualStringWithoutB = lukCharList.toString();

        final int[] actualDeletedIndex4 = lukCharList.deleteKindOfChar('r');
        System.out.println(lukCharList.toString());
        final char[] actualCharArrayWithoutR = lukCharList.getAll();
        final int actualArrayLengthWithoutR = lukCharList.length();
        final String actualStringWithoutR = lukCharList.toString();

        final int[] actualDeletedIndex5 = lukCharList.deleteKindOfChar('a');
        System.out.println(lukCharList.toString());
        final char[] actualCharArrayWithoutA = lukCharList.getAll();
        final int actualArrayLengthWithoutA = lukCharList.length();
        final String actualStringWithoutA = lukCharList.toString();
        //then
        assertArrayEquals(expectedDeletedIndex1, actualDeletedIndex1);
        assertEquals(expectedArrayLengthWithoutK, actualArrayLengthWithoutK);
        assertArrayEquals(expectedCharArrayWithoutK, actualCharArrayWithoutK);
        assertEquals(expectedStringWithoutK, actualStringWithoutK);

        assertArrayEquals(expectedDeletedIndex2, actualDeletedIndex2);
        assertEquals(expectedArrayLengthWithoutD, actualArrayLengthWithoutD);
        assertArrayEquals(expectedCharArrayWithoutD, actualCharArrayWithoutD);
        assertEquals(expectedStringWithoutD, actualStringWithoutD);

        assertArrayEquals(expectedDeletedIndex3, actualDeletedIndex3);
        assertEquals(expectedArrayLengthWithoutB, actualArrayLengthWithoutB);
        assertArrayEquals(expectedCharArrayWithoutB, actualCharArrayWithoutB);
        assertEquals(expectedStringWithoutB, actualStringWithoutB);

        assertArrayEquals(expectedDeletedIndex4, actualDeletedIndex4);
        assertEquals(expectedArrayLengthWithoutR, actualArrayLengthWithoutR);
        assertArrayEquals(expectedCharArrayWithoutR, actualCharArrayWithoutR);
        assertEquals(expectedStringWithoutR, actualStringWithoutR);

        assertArrayEquals(expectedDeletedIndex5, actualDeletedIndex5);
        assertEquals(expectedArrayLengthWithoutA, actualArrayLengthWithoutA);
        assertArrayEquals(expectedCharArrayWithoutA, actualCharArrayWithoutA);
        assertEquals(expectedStringWithoutA, actualStringWithoutA);
    }

    /*@Test
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
    }*/

    @Test
    public void should_convert_char_array_to_string() {
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