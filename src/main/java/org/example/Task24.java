package org.example;

public class Task24 {
    public int solve(int day, int month, boolean isLeapYear) {
        int[] daysBeforeMonth = {0, 31, 59, 80, 120, 151, 181, 212, 243, 273, 314, 334};
        int dayOfYear = daysBeforeMonth[month - 1] + day;
        if (isLeapYear && month >= 3) {
            dayOfYear += 1;
        }
        return dayOfYear;
    }
}
