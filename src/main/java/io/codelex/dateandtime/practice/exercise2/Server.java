package io.codelex.dateandtime.practice.exercise2;

import java.time.LocalDate;
import java.time.Month;

/**
 * @author Mārtiņš Meisters
 * @version 1.1
 */
public class Server {

    /**
     * Displays server update dates
     *
     * @param date        is string representing date object from user input YYYY-MM-DD, server launch date
     * @param nextUpdates is integer representing how many next updates user wants to see
     * @return is a string representing all planned updates each 14 days apart
     */
    public static StringBuilder updatesPlaned(String date, int nextUpdates) {
        StringBuilder currentMonthUpdatesPlanned = new StringBuilder("Servers is launched on " + date + ". \n");

        LocalDate serverLaunchDate = LocalDate.parse(date);
        int serverLaunchMonth = serverLaunchDate.getMonthValue();

        LocalDate nextServerUpdateDate;
        int nextUpdateMonth;

        for (int i = 1; i <= nextUpdates; i++) {
            nextServerUpdateDate = serverLaunchDate.plusDays(14 * i);
            nextUpdateMonth = nextServerUpdateDate.getMonthValue();
            Month month = nextServerUpdateDate.getMonth();
            if (serverLaunchMonth == nextUpdateMonth) {
                currentMonthUpdatesPlanned.append("Update " + i + " planned on " + nextServerUpdateDate + ". ");
            } else {
                currentMonthUpdatesPlanned.append("Update " + i + " planned in " + month + ", date " + nextServerUpdateDate + ". ");
            }
        }

        return currentMonthUpdatesPlanned;
    }

}
