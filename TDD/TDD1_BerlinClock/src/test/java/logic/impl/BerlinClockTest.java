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
    public void should_return_five_hours_when_hr_is_00() {
        //given
        final BerlinClock berlinClock = new BerlinClock();
        final String expectedLightMarker0to4H = "OOOO";
        final int[] testTime1 = {0,0,0};
        //when
        final String actualFiveHrs0 = berlinClock.convertFiveHrs(testTime1);
        //then
        assertEquals(expectedLightMarker0to4H, actualFiveHrs0);
    }

    @Test
    public void should_return_five_hours_when_hr_is_23() {
        //given
        final BerlinClock berlinClock = new BerlinClock();
        final String expectedLightMarker20to23H = "RRRR";
        final int[] testTime2 = {23,59,59};
        //when
        final String actualFiveHrs1 = berlinClock.convertFiveHrs(testTime2);
        //then
        assertEquals(expectedLightMarker20to23H, actualFiveHrs1);
    }

    @Test
    public void should_return_five_hours_when_hr_is_02() {
        //given
        final BerlinClock berlinClock = new BerlinClock();
        final String expectedLightMarker0to4H = "OOOO";
        final int[] testTime3 = {2,4,0};
        //when
        final String actualFiveHrs2 = berlinClock.convertFiveHrs(testTime3);
        //then
        assertEquals(expectedLightMarker0to4H, actualFiveHrs2);
    }

    @Test
    public void should_return_five_hours_when_hr_is_08() {
        //given
        final BerlinClock berlinClock = new BerlinClock();
        final String expectedLightMarker5to9H = "ROOO";
        final int[] testTime4 = {8,23,0};
        //when
        final String actualFiveHrs3 = berlinClock.convertFiveHrs(testTime4);
        //then
        assertEquals(expectedLightMarker5to9H, actualFiveHrs3);
    }

    @Test
    public void should_return_five_hours_when_hr_is_16() {
        //given
        final BerlinClock berlinClock = new BerlinClock();
        final String expectedLightMarker15to19H = "RRRO";
        final int[] testTime5 = {16,35,0};
        //when
        final String actualFiveHrs4 = berlinClock.convertFiveHrs(testTime5);
        //then
        assertEquals(expectedLightMarker15to19H, actualFiveHrs4);
    }

    @Test
    public void should_return_single_hours_when_hr_is_00() {
        //given
        final BerlinClock berlinClock = new BerlinClock();
        final String expectedLightMarker0Hrs = "OOOO";
        final int[] testTime1 = {0,0,0};
        //when
        final String actualSingleHrs0 = berlinClock.convertSingleHrs(testTime1);
        //then
        assertEquals(expectedLightMarker0Hrs, actualSingleHrs0);
    }

    @Test
    public void should_return_single_hours_when_hr_is_23() {
        //given
        final BerlinClock berlinClock = new BerlinClock();
        final String expectedLightMarker3Hrs = "RRRO";
        final int[] testTime2 = {23,59,59};
        //when
        final String actualSingleHrs1 = berlinClock.convertSingleHrs(testTime2);
        //then
        assertEquals(expectedLightMarker3Hrs, actualSingleHrs1);
        }

    @Test
    public void should_return_single_hours_when_hr_is_02() {
        //given
        final BerlinClock berlinClock = new BerlinClock();
        final String expectedLightMarker2Hrs = "RROO";
        final int[] testTime3 = {2,4,0};
        //when
        final String actualSingleHrs2 = berlinClock.convertSingleHrs(testTime3);
        //then
        assertEquals(expectedLightMarker2Hrs, actualSingleHrs2);
        }

    @Test
    public void should_return_single_hours_when_hr_is_08() {
        //given
        final BerlinClock berlinClock = new BerlinClock();
        final String expectedLightMarker3Hrs = "RRRO";
        final int[] testTime4 = {8,23,0};
        //when
        final String actualSingleHrs3 = berlinClock.convertSingleHrs(testTime4);
        //then
        assertEquals(expectedLightMarker3Hrs, actualSingleHrs3);
    }

    @Test
    public void should_return_single_hours_when_hr_is_14() {
        //given
        final BerlinClock berlinClock = new BerlinClock();
        final String expectedLightMarker4Hrs = "RRRR";
        final int[] testTime5 = {14,35,0};
        //when
        final String actualSingleHrs4 = berlinClock.convertSingleHrs(testTime5);
        //then
        assertEquals(expectedLightMarker4Hrs, actualSingleHrs4);
    }

    @Test
    public void should_return_five_minutes_when_min_is_00() {
        //given
        final BerlinClock berlinClock = new BerlinClock();
        final String expectedLightMarker0min = "OOOOOOOOOOO";
        final int[] testTime1 = {0,0,0};
        //when
        final String actualFiveMinutes1 = berlinClock.conversionFiveMinutes(testTime1);
        //then
        assertEquals(expectedLightMarker0min, actualFiveMinutes1);
    }

    @Test
    public void should_return_five_min_is_59() {
        //given
        final BerlinClock berlinClock = new BerlinClock();
        final String expectedLightMarker55min = "YYRYYRYYRYY";
        final int[] testTime2 = {23,59,59};
        //when
        final String actualFiveMinutes2 = berlinClock.conversionFiveMinutes(testTime2);
        //then
        assertEquals(expectedLightMarker55min, actualFiveMinutes2);
        }

    @Test
    public void should_return_five_minutes_when_min_is_04() {
        //given
        final BerlinClock berlinClock = new BerlinClock();
        final String expectedLightMarker0min = "OOOOOOOOOOO";
        final int[] testTime3 = {12,4,0};
        //when
        final String actualFiveMinutes3 = berlinClock.conversionFiveMinutes(testTime3);
        //then
        assertEquals(expectedLightMarker0min, actualFiveMinutes3);
    }

    @Test
    public void should_return_five_minutes_when_min_is_23() {
        //given
        final BerlinClock berlinClock = new BerlinClock();
        final String expectedLightMarker20min = "YYRYOOOOOOO";
        final int[] testTime4 = {12,23,0};
        //when
        final String actualFiveMinutes4 = berlinClock.conversionFiveMinutes(testTime4);
        //then
        assertEquals(expectedLightMarker20min, actualFiveMinutes4);
    }

    @Test
    public void should_return_five_minutes_when_min_is_35() {
        //given
        final BerlinClock berlinClock = new BerlinClock();
        final String expectedLightMarker35min = "YYRYYRYOOOO";
        final int[] testTime5 = {12,35,0};
        //when
        final String actualFiveMinutes5 = berlinClock.conversionFiveMinutes(testTime5);
        //then
        assertEquals(expectedLightMarker35min, actualFiveMinutes5);
    }

    @Test
    public void should_return_single_minutes_when_min_is_00() {
        //given
        final BerlinClock berlinClock = new BerlinClock();
        final String expectedLightMarker0min = "OOOO";
        final int[] testTime1 = {0,0,0};
        //when
        final String actualSingleMinutes1 = berlinClock.convertSingleMinutes(testTime1);
        //then
        assertEquals(expectedLightMarker0min, actualSingleMinutes1);
    }

    @Test
    public void should_return_single_minutes_when_min_is_59() {
        //given
        final BerlinClock berlinClock = new BerlinClock();
        final String expectedLightMarker4min = "YYYY";
        final int[] testTime2 = {23,59,59};
        //when
        final String actualSingleMinutes2 = berlinClock.convertSingleMinutes(testTime2);
        //then
        assertEquals(expectedLightMarker4min, actualSingleMinutes2);
    }

    @Test
    public void should_return_single_minutes_when_min_is_32() {
        //given
        final BerlinClock berlinClock = new BerlinClock();
        final String expectedLightMarker2min = "YYOO";
        final int[] testTime3 = {12,32,0};
        //when
        final String actualSingleMinutes3 = berlinClock.convertSingleMinutes(testTime3);
        //then
        assertEquals(expectedLightMarker2min, actualSingleMinutes3);
    }

    @Test
    public void should_return_single_minutes_when_min_is_34() {
        //given
        final BerlinClock berlinClock = new BerlinClock();
        final String expectedLightMarker4min = "YYYY";
        final int[] testTime4 = {12,34,0};
        //when
        final String actualSingleMinutes4 = berlinClock.convertSingleMinutes(testTime4);
        //then
        assertEquals(expectedLightMarker4min, actualSingleMinutes4);
    }

    @Test
    public void should_return_single_minutes_when_min_is_35() {
        //given
        final BerlinClock berlinClock = new BerlinClock();
        final String expectedLightMarker0min = "OOOO";
        final int[] testTime5 = {12,35,0};
        //when
        final String actualSingleMinutes5 = berlinClock.convertSingleMinutes(testTime5);
        //then
        assertEquals(expectedLightMarker0min, actualSingleMinutes5);

    }

    @Test
    public void should_return_time_lights_when_time_is_00_00_00() {
        //given
        final BerlinClock berlinClock = new BerlinClock();
        final String expectedMarker1 = "YOOOOOOOOOOOOOOOOOOOOOOO";
        final String testTime1 = "00:00:00";
        //when
        final String actualMarker1 = berlinClock.convertTime(testTime1);
        //then
        assertEquals(expectedMarker1,actualMarker1);
    }

    @Test
    public void should_return_time_lights_when_time_is_23_59_59() {
        //given
        final BerlinClock berlinClock = new BerlinClock();
        final String expectedMarker2 = "ORRRRRRROYYRYYRYYRYYYYYY";
        final String testTime2 = "23:59:59";
        //when
        final String actualMarker2 = berlinClock.convertTime(testTime2);
        //then
        assertEquals(expectedMarker2,actualMarker2);
        }

    @Test
    public void should_return_time_lights_when_time_is_16_50_06() {
        //given
        final BerlinClock berlinClock = new BerlinClock();
        final String expectedMarker3 = "YRRROROOOYYRYYRYYRYOOOOO";
        final String testTime3 = "16:50:06";
        //when
        final String actualMarker3 = berlinClock.convertTime(testTime3);
        //then
        assertEquals(expectedMarker3,actualMarker3);
    }

    @Test
    public void should_return_time_lights_when_time_is_11_37_01() {
        //given
        final BerlinClock berlinClock = new BerlinClock();
        final String expectedMarker4 = "ORROOROOOYYRYYRYOOOOYYOO";
        final String testTime4 = "11:37:01";
        //when
        final String actualMarker4 = berlinClock.convertTime(testTime4);
        //then
        assertEquals(expectedMarker4,actualMarker4);
    }
}