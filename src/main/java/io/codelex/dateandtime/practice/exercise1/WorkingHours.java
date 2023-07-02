package io.codelex.dateandtime.practice.exercise1;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * My first documentation comments
 *
 * @author "Mārtiņš Meisters"
 * @version 1.1.
 */
public class WorkingHours {
    /**
     * Calculates working hours for period between two dates, input format YYYY-MM-DD
     *
     * @param date1 as string date from
     * @param date2 as string date to
     * @return amount of working hours during working week days
     */
    public static int calculateWorkingHours(String date1, String date2) {
        int workingDays = 0;
        long diff;

        // CREATE LOACALDATE OBJECTS WITH CURRENT DATES
        LocalDate d1 = LocalDate.parse(date1);
        LocalDate d2 = LocalDate.parse(date2);

        // GET DAYS COUNT BETWEEN TWO DATES
        diff = ChronoUnit.DAYS.between(d1, d2);

        // COUNT THE DAYS THAT ARE NOT SATURDAY AND SUNDAY
        while (workingDays <= diff) {
            d1 = d1.plusDays(1);
            if (!(d1.getDayOfWeek() == DayOfWeek.SATURDAY || d1.getDayOfWeek() == DayOfWeek.SUNDAY)) {
                workingDays++;
            }
        }
        // RETURN ALL WORKING DAYS MULTIPLIED WITH 8 WORKING HOURS
        return workingDays * 8;
    }
}
