package logic.impl;

import org.junit.Test;

import static org.junit.Assert.*;

public class BerlinClockTest {

    @Test
    public void should_return_convert_seconds() {
        //given
        final BerlinClock berlinClock = new BerlinClock();
        final String expectedLightMarkerEven = "Y";
        final String expectedLightMarkerOdd = "O";
        final int[] even = {0,0,0};
        final int[] odd = {23,59,59};
        //when
        final String actualEven = berlinClock.convertSeconds(even);
        final String actualOdd = berlinClock.convertSeconds(odd);
        //then
        assertEquals(expectedLightMarkerEven, actualEven);
        assertEquals(expectedLightMarkerOdd, actualOdd);
    }

    @Test
    public void should_return_five_hours() {
        //given
        final BerlinClock berlinClock = new BerlinClock();
        final String expectedLightMarker0to4H = "OOOO";
        final String expectedLightMarker5to9H = "ROOO";
        final String expectedLightMarker15to19H = "RRRO";
        final String expectedLightMarker20to23H = "RRRR";
        final int[] testTime1 = {0,0,0};
        final int[] testTime2 = {23,59,59};
        final int[] testTime3 = {2,4,0};
        final int[] testTime4 = {8,23,0};
        final int[] testTime5 = {16,35,0};
        //when
        final String actualFiveHrs0 = berlinClock.convertFiveHrs(testTime1);
        final String actualFiveHrs1 = berlinClock.convertFiveHrs(testTime2);
        final String actualFiveHrs2 = berlinClock.convertFiveHrs(testTime3);
        final String actualFiveHrs3 = berlinClock.convertFiveHrs(testTime4);
        final String actualFiveHrs4 = berlinClock.convertFiveHrs(testTime5);
        //then
        assertEquals(expectedLightMarker0to4H, actualFiveHrs0);
        assertEquals(expectedLightMarker20to23H, actualFiveHrs1);
        assertEquals(expectedLightMarker0to4H, actualFiveHrs2);
        assertEquals(expectedLightMarker5to9H, actualFiveHrs3);
        assertEquals(expectedLightMarker15to19H, actualFiveHrs4);
    }

    @Test
    public void should_return_single_hours() {
        //given
        final BerlinClock berlinClock = new BerlinClock();
        final String expectedLightMarker0Hrs = "OOOO";
        final String expectedLightMarker2Hrs = "RROO";
        final String expectedLightMarker3Hrs = "RRRO";
        final String expectedLightMarker4Hrs = "RRRR";
        final int[] testTime1 = {0,0,0};
        final int[] testTime2 = {23,59,59};
        final int[] testTime3 = {2,4,0};
        final int[] testTime4 = {8,23,0};
        final int[] testTime5 = {14,35,0};
        //when
        final String actualSingleHrs0 = berlinClock.convertSingleHrs(testTime1);
        final String actualSingleHrs1 = berlinClock.convertSingleHrs(testTime2);
        final String actualSingleHrs2 = berlinClock.convertSingleHrs(testTime3);
        final String actualSingleHrs3 = berlinClock.convertSingleHrs(testTime4);
        final String actualSingleHrs4 = berlinClock.convertSingleHrs(testTime5);
        //then
        assertEquals(expectedLightMarker0Hrs, actualSingleHrs0);
        assertEquals(expectedLightMarker3Hrs, actualSingleHrs1);
        assertEquals(expectedLightMarker2Hrs, actualSingleHrs2);
        assertEquals(expectedLightMarker3Hrs, actualSingleHrs3);
        assertEquals(expectedLightMarker4Hrs, actualSingleHrs4);
    }

    @Test
    public void should_return_five_minutes() {
        //given
        final BerlinClock berlinClock = new BerlinClock();
        final String expectedLightMarker0min = "OOOOOOOOOOO";
        final String expectedLightMarker20min = "YYRYOOOOOOO";
        final String expectedLightMarker35min = "YYRYYRYOOOO";
        final String expectedLightMarker55min = "YYRYYRYYRYY";
        final int[] testTime1 = {0,0,0};
        final int[] testTime2 = {23,59,59};
        final int[] testTime3 = {12,4,0};
        final int[] testTime4 = {12,23,0};
        final int[] testTime5 = {12,35,0};
        //when
        //final String actualFiveMinutes1 = berlinClock.conversionFiveMinutes(testTime1);
        //final String actualFiveMinutes2 = berlinClock.conversionFiveMinutes(testTime2);
        final String actualFiveMinutes3 = berlinClock.conversionFiveMinutes(testTime3);
        //final String actualFiveMinutes4 = berlinClock.conversionFiveMinutes(testTime4);
        //final String actualFiveMinutes5 = berlinClock.conversionFiveMinutes(testTime5);
        //then
        //assertEquals(expectedLightMarker0min, actualFiveMinutes1);
        //assertEquals(expectedLightMarker55min, actualFiveMinutes2);
        assertEquals(expectedLightMarker0min, actualFiveMinutes3);
        //assertEquals(expectedLightMarker20min, actualFiveMinutes4);
        //assertEquals(expectedLightMarker35min, actualFiveMinutes5);
    }

    @Test
    public void should_return_single_minutes() {
        //given
        final BerlinClock berlinClock = new BerlinClock();
        final String expectedLightMarker0min = "OOOO";
        final String expectedLightMarker2min = "YYOO";
        final String expectedLightMarker4min = "YYYY";
        final int[] testTime1 = {0,0,0};
        final int[] testTime2 = {23,59,59};
        final int[] testTime3 = {12,32,0};
        final int[] testTime4 = {12,34,0};
        final int[] testTime5 = {12,35,0};
        //when
        final String actualSingleMinutes1 = berlinClock.convertSingleMinutes(testTime1);
        final String actualSingleMinutes2 = berlinClock.convertSingleMinutes(testTime2);
        final String actualSingleMinutes3 = berlinClock.convertSingleMinutes(testTime3);
        final String actualSingleMinutes4 = berlinClock.convertSingleMinutes(testTime4);
        final String actualSingleMinutes5 = berlinClock.convertSingleMinutes(testTime5);
        //then
        assertEquals(expectedLightMarker0min, actualSingleMinutes1);
        assertEquals(expectedLightMarker4min, actualSingleMinutes2);
        assertEquals(expectedLightMarker2min, actualSingleMinutes3);
        assertEquals(expectedLightMarker4min, actualSingleMinutes4);
        assertEquals(expectedLightMarker0min, actualSingleMinutes5);

    }

    @Test
    public void should_return_time_lights() {
        //given
        final BerlinClock berlinClock = new BerlinClock();
        final String expectedMarker1 = "YOOOOOOOOOOOOOOOOOOOOOOO";
        final String expectedMarker2 = "ORRRRRRROYYRYYRYYRYYYYYY";
        final String expectedMarker3 = "YRRROROOOYYRYYRYYRYOOOOO";
        final String expectedMarker4 = "ORROOROOOYYRYYRYOOOOYYOO";
        final String testTime1 = "00:00:00";
        final String testTime2 = "23:59:59";
        final String testTime3 = "16:50:06";
        final String testTime4 = "11:37:01";
        //when
        final String actualMarker1 = berlinClock.convertTime(testTime1);
        final String actualMarker2 = berlinClock.convertTime(testTime2);
        final String actualMarker3 = berlinClock.convertTime(testTime3);
        final String actualMarker4 = berlinClock.convertTime(testTime4);
        //then
        assertEquals(expectedMarker1,actualMarker1);
        assertEquals(expectedMarker2,actualMarker2);
        assertEquals(expectedMarker3,actualMarker3);
        assertEquals(expectedMarker4,actualMarker4);
    }
}