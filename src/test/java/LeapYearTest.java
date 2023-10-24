import org.example.LeapYearChecker;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LeapYearTest {

        //******lagt til disse*****
        @Test
        void TEST_divisible_by_4_but_not_100_are_leap_years(){
            assertEquals(true,LeapYearChecker.IsLeapYear(4));
        }

        @Test
        void TEST_divisible_by_400_are_leap_years(){
            assertEquals(true, LeapYearChecker.IsLeapYear(400));
        }

        @Test
        void TEST_not_divisible_by_4_are_not_leap_years(){
            assertEquals(false, LeapYearChecker.IsLeapYear(3));
        }

        @Test
        void TEST_divisibile_by_100_but_not_400_are_not_leap_years() {
            assertEquals(false, LeapYearChecker.IsLeapYear(100));
        }


            //*******************************************************



        @Test
        void testYear_2000() {
            assertEquals(true,LeapYearChecker.IsLeapYear(2000));
        }

        @Test
        public void testYear_1900() {
            assertEquals(false,LeapYearChecker.IsLeapYear(1900));
        }

        @Test
        public void testYear_1800() {
            assertEquals(false,LeapYearChecker.IsLeapYear(1800));
        }

        @Test
        public void testYear_1700() {
            assertEquals(false,LeapYearChecker.IsLeapYear(1700));
        }
        @Test
        public void testYear_1600() {
            assertEquals(true,LeapYearChecker.IsLeapYear(1600));
        }


    }

