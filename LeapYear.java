package Leapyear;

public class LeapYear {
    private int year;
    static boolean isLeapYear;

    // constructor
    public LeapYear() {

    }

    public int getLeapYear() {
        return this.year;
    }

    public static int yearlength(int year) {
        int yearLength = String.valueOf(year).length();
        if (yearLength > 4) {
            throw new RuntimeException("Years can only be 4 numbers.");
        }
        return yearLength;
    }

    public static boolean isLeapYear(int year) {
        if (isDivisibleBy4(year)) {
            if (!isDivisibleBy100(year)) {
                isLeapYear = true;
            } else if (isDivisibleBy400(year)) {
                isLeapYear = true;
            }
        } else {
            isLeapYear = false;
        }

        return isLeapYear;
    }

    public static boolean isDivisibleBy4(int year) {
        return year % 4 == 0;
    }

    public static boolean isDivisibleBy400(int year) {
        return year % 400 == 0;
    }

    public static boolean isDivisibleBy100(int year) {
        return year % 100 == 0;
    }

}