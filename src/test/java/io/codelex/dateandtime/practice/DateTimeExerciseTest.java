package io.codelex.dateandtime.practice;

import org.junit.Test;

import java.time.*;
import java.time.format.DateTimeParseException;

import static java.time.Month.JANUARY;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class DateTimeExerciseTest {
    @Test
    public void shouldCreateNewDate() {
        LocalDate newYearsEve = null; // create new years eve 2017 using the localdate static factory methods
        assertThat(newYearsEve.getYear(), is(equalTo(2017)));
        assertThat(newYearsEve.getMonth(), is(equalTo(Month.DECEMBER)));
        assertThat(newYearsEve.getDayOfMonth(), is(equalTo(31)));
    }

    @Test
    public void shouldGotoFirstOfNextMonth() {
        LocalDate newYearsEve = DateTimeExercise.createNewYearsEve2017();
        LocalDate firstJanuary2018 = null;
        assertThat(firstJanuary2018.getYear(), is(equalTo(2018)));
        assertThat(firstJanuary2018.getMonth(), is(equalTo(Month.JANUARY)));
        assertThat(firstJanuary2018.getDayOfMonth(), is(equalTo(1)));
    }

    @Test
    public void shouldRetrieveDateInformationUsingChronoFields() {
        LocalDate newYearsEve = DateTimeExercise.createNewYearsEve2017();
        int year = 0; // replace this by getting the year using chrono fields interface
        int month = 0;
        int day = 0;
        assertThat(year, is(equalTo(newYearsEve.getYear())));
        assertThat(month, is(equalTo(12)));
        assertThat(day, is(equalTo(newYearsEve.getDayOfMonth())));
    }

    @Test
    public void shouldParseLocalDate() {
        String newYearsEveAsString = null;
        LocalDate newYearsEve = null; // parse the string to a date
        assertThat(newYearsEve.getYear(), is(equalTo(2017)));
        assertThat(newYearsEve.getMonth(), is(equalTo(Month.DECEMBER)));
        assertThat(newYearsEve.getDayOfMonth(), is(equalTo(31)));
    }

    @Test(expected = DateTimeParseException.class)
    public void shouldThrowParseException() {
        String newYearsEveAsString = null;
        LocalDate newYearsEve = null; // parse the an error
    }

    @Test
    public void shouldParseLocalTime() {
        String midnightAsString = null;
        LocalTime midnight = null; // parse the time
        assertThat(midnight.getHour(), is(equalTo(0)));
        assertThat(midnight.getMinute(), is(equalTo(0)));
        assertThat(midnight.getSecond(), is(equalTo(0)));
    }

    @Test
    public void shouldCreateLocalDateTimeNewYearsEve() {
        LocalDateTime newYearsEve = null; // create LocalDateTime for new years eve at midnight
        assertThat(newYearsEve.getYear(), is(equalTo(2017)));
        assertThat(newYearsEve.getMonth(), is(equalTo(Month.DECEMBER)));
        assertThat(newYearsEve.getDayOfMonth(), is(equalTo(31)));
        assertThat(newYearsEve.getHour(), is(equalTo(0)));
        assertThat(newYearsEve.getMinute(), is(equalTo(0)));
        assertThat(newYearsEve.getSecond(), is(equalTo(0)));
    }

    @Test
    public void shouldCreateNewYearsInstant() {
        Instant newYearsEveInstant = null; // use https://www.epochconverter.com/ to create the instance
        assertNotNull(newYearsEveInstant);
    }

    @Test
    public void shouldCalculateDaysBetween() {
        LocalDate[] dates = DateTimeExercise.getTwoLocalDates();
        long daysBetween = 0; // calculate days between dates[0] and dates[1]
        assertThat(DateTimeExercise.DAYS_BETWEEN, equalTo(daysBetween));
    }

    @Test
    public void shouldCreateDurationFromTemporalUnit() {
        Duration duration = null; // create a duration of 5 seconds
        long seconds = duration.getSeconds();
        assertThat(5L, equalTo(seconds));
    }

    @Test
    public void shouldCheckIfDurationIsZero() {
        Duration duration = null; // create a duration of 5 days
        boolean isZero = true; // check for the duration if it's zero
        assertThat(false, equalTo(isZero));
    }

    @Test
    public void shouldFormatToString() {
        LocalDate newYearsEve = DateTimeExercise.createNewYearsEve2017();
        String format = null; // format the string
        assertThat("2017-12-31", equalTo(format));
    }

    @Test
    public void shouldUseWithMethodtoChangeDate() {
        LocalDate newYearsEve = DateTimeExercise.createNewYearsEve2017();
        LocalDate newYearsEve2018 = null; // change the newYearsEve using the with method
        LocalDate firstJanuary = null;
        assertThat(2018, equalTo(newYearsEve2018.getYear()));
        assertThat(1, equalTo(firstJanuary.getDayOfMonth()));
    }

    @Test
    public void shouldAdjustToNewYearsEve() {
        LocalDate firstOfDecember = LocalDate.of(2017, 12, 1);
        LocalDate newYearsEve = null; // write a temporal adjuster to ajust the firstOfDecember to new years eve
        assertThat(newYearsEve.getYear(), is(equalTo(2017)));
        assertThat(newYearsEve.getMonth(), is(equalTo(Month.DECEMBER)));
        assertThat(newYearsEve.getDayOfMonth(), is(equalTo(31)));
    }

    @Test
    public void shouldFindTheNextFriday13th() {
        LocalDate from = LocalDate.of(2017, JANUARY, 1);
        LocalDate expected = LocalDate.of(2017, JANUARY, 13);
        assertEquals(expected, DateTimeExercise.findNextFriday13th(from));
    }
}