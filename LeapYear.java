/******************************************************************************
 *  Compilation:  javac LeapYear.java
 *  Execution:    java LeapYear n
 *
 *  Prints true if n corresponds to a leap year, and false otherwise.
 *  Assumes n >= 1582, corresponding to a year in the Gregorian calendar.
 *
 *  % java LeapYear 2004
 *  true
 *
 *  % java LeapYear 1900
 *  false
 *
 *  % java LeapYear 2000
 *  true
 *
 ******************************************************************************/


public class LeapYear {
    public static void main(String[] args) {
        // reads first argument from command line as integer
        int year = Integer.parseInt(args[0]);
        // isLeapYear variable declared
        boolean isLeapYear;

        // checks if year is divisible by 4 without reminder and returns true if it is
        isLeapYear = (year % 4 == 0);

        // checks if year is divisible by 4 and not by 100 and returns true if it is
        isLeapYear = isLeapYear && (year % 100 != 0);

        // checks if year is divisible by 4 and 100 unless divisible by 400 and returns tru if it is
        isLeapYear = isLeapYear || (year % 400 == 0);

        // prints out the result of above computations
        System.out.println(isLeapYear);
    }

}
