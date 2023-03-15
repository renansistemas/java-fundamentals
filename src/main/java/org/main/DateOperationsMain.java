package org.main;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

public class DateOperationsMain {

    public static void main(String[] args) {

        LocalDate localDateIso8601 = LocalDate.parse("2022-07-20");
        LocalDateTime localDateTimeIso8601 = LocalDateTime.parse("2022-07-20T01:30:26");
        Instant instantIso8601 = Instant.parse("2022-07-20T01:30:26Z");

        // capturando informacoes de data e hora
        System.out.println("localDateIso8601 dia = " + localDateIso8601.getDayOfMonth());
        System.out.println("localDateIso8601 mês = " + localDateIso8601.getMonthValue());
        System.out.println("localDateIso8601 ano = " + localDateIso8601.getYear());
        System.out.println("localDateTimeIso8601 hora = " + localDateTimeIso8601.getHour());
        System.out.println("localDateTimeIso8601 minuto = " + localDateTimeIso8601.getMinute());

        // operacoes data e hora
        LocalDate pastWeekLocalDate = localDateIso8601.minusDays(7);
        LocalDate nextWeekLocalDate = localDateIso8601.plusDays(7);
        System.out.println("pastWeekLocalDate = " + pastWeekLocalDate);
        System.out.println("nextWeekLocalDate = " + nextWeekLocalDate);

        LocalDateTime pastWeekLocalDateTime = localDateTimeIso8601.minusDays(7);
        LocalDateTime nextWeekLocalDateTime = localDateTimeIso8601.plusDays(7);
        System.out.println("pastWeekLocalDateTime = " + pastWeekLocalDateTime);
        System.out.println("nextWeekLocalDateTime = " + nextWeekLocalDateTime);

        Instant pastWeekInstant = instantIso8601.minus(7, ChronoUnit.DAYS);
        Instant nextWeekInstant = instantIso8601.plus(7, ChronoUnit.DAYS);
        System.out.println("pastWeekInstant = " + pastWeekInstant);
        System.out.println("nextWeekInstant = " + nextWeekInstant);

        // calcular duracao
        Duration t1 = Duration.between(pastWeekLocalDateTime, localDateTimeIso8601);
        System.out.println("t1 dias = " + t1.toDays());

        long daysBetween = ChronoUnit.DAYS.between(pastWeekLocalDate, nextWeekLocalDate);
        System.out.println("daysBetween dias = " + daysBetween);





    }
}
