package logic.impl;

import org.junit.Test;

import static org.junit.Assert.*;

public class BerlinClockTest {

    @Test
    public void should_return_convert_seconds() {
        //given
        final BerlinClock berlinClock = new BerlinClock();
        final String expectedLightMarkerEven = "O";
        final String expectedLightMarkerOdd = "Y";
        final String even = "00:00:00";
        final String odd = "23:59:59";
        //when
        final String actualEven = berlinClock.convertSeconds(even);
        final String actualOdd = berlinClock.convertSeconds(odd);
        //then
        assertEquals(expectedLightMarkerEven, actualEven);
        assertEquals(expectedLightMarkerOdd, actualOdd);
    }

    @Test
    public void should_return_convert_five_hours() {
        //given
        final BerlinClock berlinClock = new BerlinClock();
        final String expectedLightMarker0to4H = "OOOO";
        final String expectedLightMarker5to9H = "ROOO";
        final String expectedLightMarker15to19H = "RRRO";
        final String expectedLightMarker20to23H = "RRRR";
        final String midnight = "00:00:00";
        final String lastSecondAday = "23:59:59";
        final String twoHrsFourMin = "02:04:00";
        final String eightHrsTwentyThreeMin = "08:23:00";
        final String sixteenHrsThirtyFiveMin = "16:35:00";
        //when
        final String actualFiveHrs0 = berlinClock.convertFiveHrs(midnight);
        final String actualFiveHrs1 = berlinClock.convertFiveHrs(lastSecondAday);
        final String actualFiveHrs2 = berlinClock.convertFiveHrs(twoHrsFourMin);
        final String actualFiveHrs3 = berlinClock.convertFiveHrs(eightHrsTwentyThreeMin);
        final String actualFiveHrs4 = berlinClock.convertFiveHrs(sixteenHrsThirtyFiveMin);
        //then
        assertEquals(expectedLightMarker0to4H, actualFiveHrs0);
        assertEquals(expectedLightMarker20to23H, actualFiveHrs1);
        assertEquals(expectedLightMarker0to4H, actualFiveHrs2);
        assertEquals(expectedLightMarker5to9H, actualFiveHrs3);
        assertEquals(expectedLightMarker15to19H, actualFiveHrs4);



    }
}