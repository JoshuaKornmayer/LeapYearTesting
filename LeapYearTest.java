package Leapyear;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class LeapYearTest {

    @Test(expected = RuntimeException.class)
    public final void whenMoreThan4NumbersAreUsedForAYearThenAnExceptionIsThrown() {
        LeapYear.yearlength(20135);
    }

    @Test
    public void isTheGivenYearALeapYear() {
        // LeapYear leapyear = new LeapYear(2013);

        assertTrue(LeapYear.isLeapYear(2016));
    }

    @Test
    public void isTheGivenYearDivisibleBy4() {
        // LeapYear leapyear = new LeapYear(2013);

        assertTrue(LeapYear.isDivisibleBy4(2016));
    }

    @Test
    public void isTheGivenYearDivisibleBy400() {
        // LeapYear leapyear = new LeapYear(2013);

        assertTrue(LeapYear.isDivisibleBy400(2000));
    }

    @Test
    public void isTheGivenYearNotDivisibleBy100() {
        // LeapYear leapyear = new LeapYear(2013);

        assertEquals(true, LeapYear.isDivisibleBy100(2000));
    }
}