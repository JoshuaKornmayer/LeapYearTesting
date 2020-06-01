package Leapyear;

public class LeapYear {
    private long year;

    // constructor
    public LeapYear(long year) {
        this.year = year;
    }

    public boolean isLeapYear() {
        return isDivisibleBy4();

    }

    public boolean isDivisibleBy4() {
        return ((year % 4 == 0) && isDivisibleBy400());
    }

    public boolean isDivisibleBy400() {
        return true;
    }

}