
public class LeapYear {

    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) {
            return false;
        } else if (year % 4 == 0 && year % 100 != 0) {
            return true;
        } else return year % 100 == 0 && year % 400 == 0;
    }
}


/*    A year is a leap year if year is evenly divisible by 4 but not by 100
        or else:
        if the year is evenly divisible by both 100 and 400.*/
