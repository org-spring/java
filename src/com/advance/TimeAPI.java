package com.advance;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class TimeAPI {
    static void dateTime() {
        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();
        LocalDateTime localDateTime = LocalDateTime.now();

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String format = localDateTime.format(dateTimeFormatter);

        System.out.println(localDateTime);
        System.out.println(format);

        System.out.println(localTime);
        System.out.println(localDate);
    }

    static void monthDaySecond() {
        LocalDateTime localDateTime = LocalDateTime.now();

        Month month = localDateTime.getMonth();
        DayOfWeek dayOfWeek = localDateTime.getDayOfWeek();
        int seconds = localDateTime.getSecond();

        System.out.println(month);
        System.out.println(dayOfWeek);
        System.out.println(seconds);
    }

    static void customDate() {
        LocalDate localDate = LocalDate.now();

        LocalDate custom = LocalDate.of(2026, 1, 1);
        LocalDate specific = localDate.withDayOfMonth(14).withYear(2005).withMonth(6);

        System.out.println(custom);
        System.out.println(specific);
    }

    static void periodDuration() {
        LocalDate dateOne = LocalDate.now();
        LocalDate dateTwo = LocalDate.of(2005, 6, 14);
        Period gapBetweenDate = Period.between(dateOne, dateTwo);

        LocalTime timeOne = LocalTime.now();

        Duration duration = Duration.ofHours(5);
        LocalTime timeTwo = timeOne.plus(duration);

        Duration gapBetweenHours = Duration.between(timeOne, timeTwo);

        System.out.println(gapBetweenDate);
        System.out.println(gapBetweenHours);
    }

    static void zone() {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        ZonedDateTime currentZone = ZonedDateTime.now();

        ZoneId america = ZoneId.of("America/New_York");
        ZoneId tokyo = ZoneId.of("Asia/Tokyo");

        ZonedDateTime americaZone = currentZone.withZoneSameInstant(america);
        ZonedDateTime tokyoZone = currentZone.withZoneSameInstant(tokyo);

        String formatZoneAmerica = americaZone.format(dateTimeFormatter);
        String formatZoneTokyo = tokyoZone.format(dateTimeFormatter);

        System.out.println(formatZoneAmerica);
        System.out.println(formatZoneTokyo);
    }

    static void main(String[] args) {
        zone();
    }
}
