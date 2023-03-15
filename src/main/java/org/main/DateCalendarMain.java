package org.main;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Hello world!
 */
public class DateCalendarMain {
    public static void main(String[] args) {

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        LocalDate localDate = LocalDate.now();
        LocalDateTime localDateTime = LocalDateTime.now();
        Instant instant = Instant.now();

        //Texto no formato ISO 8601
        LocalDate localDateIso8601 = LocalDate.parse("2023-03-03");
        LocalDateTime localDateTimeIso8601 = LocalDateTime.parse("2023-03-03T02:10:36");
        Instant instantIso8601 = Instant.parse("2023-03-03T02:10:36Z");

        String strDate = "2023-03-03T02:10:36-03:00";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ssXXX");
        ZonedDateTime zonedDateTime = ZonedDateTime.parse(strDate, formatter);
        Instant brasiliaTime = zonedDateTime.toInstant();

        LocalDate localDateCustum = LocalDate.parse("20/07/2022", fmt1);
        LocalDateTime localDateTimeCustum = LocalDateTime.parse("20/07/2022 01:30", fmt2);

        LocalDate dateFull = LocalDate.of(2022,7,20);
        LocalDateTime dateTimeFull = LocalDateTime.of(2022, 7, 20, 1, 30);


        System.out.println("Data local: " + localDate);
        System.out.println("Data e Hora local: " + localDateTime);
        System.out.println("Data e Hora local GMT (Londres): " + instant);
        System.out.println("Data no formato ISO 8601: " + localDateIso8601);
        System.out.println("Data e Hora no formato ISO 8601: " + localDateTimeIso8601);
        System.out.println("Data e Hora local GMT (Londres) no formato ISO 8601: " + instantIso8601);
        System.out.println("Horário de Londres no formato ISO 8601: " + brasiliaTime);
        System.out.println("Data local customizada: " + localDateCustum);
        System.out.println("Data local e Hora customizada: " + localDateTimeCustum);
        System.out.println("Data completa: " + dateFull);
        System.out.println("Data e Hora completa: " + dateTimeFull);

    }
}
