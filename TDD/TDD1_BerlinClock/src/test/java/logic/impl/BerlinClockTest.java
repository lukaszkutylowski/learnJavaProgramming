package logic.impl;

import org.junit.Test;

import static org.junit.Assert.*;

public class BerlinClockTest {

    @Test
    public void convertTime() {
        //given
        final BerlinClock berlinClock = new BerlinClock();
        final String expectedLightMarkerEven = "O";
        final String expectedLightMarkerOdd = "R";
        final String even = "00";
        final String odd = "01";
        //when
        final String actualEven = berlinClock.convertTime(even);
        final String actualOdd = berlinClock.convertTime(odd);
        //then
        assertEquals(expectedLightMarkerEven, actualEven);
        assertEquals(expectedLightMarkerOdd, actualOdd);

    }
}