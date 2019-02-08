package logic.impl;

import org.junit.Test;

import static org.junit.Assert.*;

public class BerlinClockTest {

    @Test
    public void convertSeconds() {
        //given
        final BerlinClock berlinClock = new BerlinClock();
        final String expectedLightMarkerEven = "O";
        final String expectedLightMarkerOdd = "Y";
        final String even = "00:00:00";
        final String odd = "23:59:59";
        //when
        final String actualEven = berlinClock.convertTime(even);
        final String actualOdd = berlinClock.convertTime(odd);
        //then
        assertEquals(expectedLightMarkerEven, actualEven);
        assertEquals(expectedLightMarkerOdd, actualOdd);

    }
}