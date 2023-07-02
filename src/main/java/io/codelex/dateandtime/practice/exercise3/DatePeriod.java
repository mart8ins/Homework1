package io.codelex.dateandtime.practice.exercise3;

import java.time.LocalDate;

public class DatePeriod {
    LocalDate start;
    LocalDate end;

    public DatePeriod(LocalDate start, LocalDate end) {
        this.start = start;
        this.end = end;
    }

    private int isOverlap(DatePeriod period) {
        return this.end.compareTo(period.start);
    }

    private boolean isPeriodsEqual(DatePeriod period) {
        if (this.start.compareTo(period.start) == 0) {
            if (this.end.compareTo(period.end) == 0) {
                return true;
            }
        }
        return false;
    }

    private DatePeriod calculateOverlapPeriod(DatePeriod period) {
        int startDif = this.end.compareTo(period.start);
        int endDif = this.end.compareTo(period.end);
        System.out.println(this.end.compareTo(period.end));

        LocalDate newStart = this.end.minusDays(startDif);
        LocalDate newEnd = period.end.plusDays(endDif);

        return new DatePeriod(newStart, newEnd);
    }

    public DatePeriod intersection(DatePeriod period) {
        if (isPeriodsEqual(period)) {
            System.out.println("Both periods are equal!");
        }
        if (isOverlap(period) < 0) {
            System.out.println("Periods don`t overlap.");
            return null;
        } else {
            return calculateOverlapPeriod(period);
        }
    }

    @Override
    public String toString() {
        return "DatePeriod{" +
                "start=" + start +
                ", end=" + end +
                '}';
    }
}
