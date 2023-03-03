package org.main;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * Hello world!
 */
public class DateCalendarMain {
    public static void main(String[] args) {

        LocalDate localDate = LocalDate.now();
        LocalDateTime localDateTime = LocalDateTime.now();
        Instant instant = Instant.now();

        System.out.println("Data local: " + localDate);
        System.out.println("Data e Hora local: " + localDateTime);
        System.out.println("Data e Hora local GMT (Londres): " + instant);

        System.out.println("Hello World!");
    }
}
