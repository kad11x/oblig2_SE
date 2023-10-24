package org.example;

public class LeapYearChecker {

    public static boolean IsLeapYear(int year) {
        //Et år er et skuddår
        //
        //    Når det er delelig med 4, men ikke 100
        //    Når det er delelig med 400
        //    (For eksempel var år 2000 et skuddår)
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }
}