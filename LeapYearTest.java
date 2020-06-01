package Leapyear;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class LeapYearTest {

    @Test
    public void isTheGivenYearALeapYear() {
        LeapYear leapyear = new LeapYear();

        assertTrue(leapyear.isLeapYear());
    }
}