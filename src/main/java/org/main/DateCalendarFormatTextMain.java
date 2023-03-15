package org.main;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DateCalendarFormatTextMain {

    public static void main(String[] args) {

        LocalDate localDateIso8601 = LocalDate.parse("2022-07-20");
        LocalDateTime localDateTimeIso8601 = LocalDateTime.parse("2022-07-20T01:30:26");
        Instant instantIso8601 = Instant.parse("2022-07-20T01:30:26Z");

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
        DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME;
        DateTimeFormatter fmt5 = DateTimeFormatter.ISO_INSTANT;

        //duas formas de chamar a formatacao
        System.out.println("d04: " + localDateIso8601.format(fmt1));
        System.out.println("d04: " + fmt1.format(localDateIso8601));

        System.out.println("d05: " + localDateTimeIso8601.format(fmt1));
        System.out.println("d05: " + localDateTimeIso8601.format(fmt2));
        System.out.println("d05: " + localDateTimeIso8601.format(fmt4));

        System.out.println("d06: " + fmt3.format(instantIso8601));
        System.out.println("d06: " + fmt5.format(instantIso8601));

    }
}
