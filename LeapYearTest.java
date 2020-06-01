package Leapyear;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class LeapYearTest {

    @Test
    public void isTheGivenYearALeapYear() {
        LeapYear leapyear = new LeapYear(2013);

        assertTrue(leapyear.isLeapYear());
    }

    @Test
    public void isTheGivenYearDivisibleBy4() {
        LeapYear leapyear = new LeapYear(2013);

        assertTrue(leapyear.isDivisibleBy4());
    }
}