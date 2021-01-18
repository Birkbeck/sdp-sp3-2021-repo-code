package ch12.sec03;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class DateAdjusters {
    public static void main(String[] args) {
        int year = 2014;
        int month = 6;
        LocalDate firstTuesday = LocalDate.of(year, month, 1).with(
                TemporalAdjusters.nextOrSame(DayOfWeek.TUESDAY));
        System.out.println("firstTuesday: " + firstTuesday);

        LocalDate today = LocalDate.of(2013, 11, 9); // Saturday
        TemporalAdjuster NEXT_WORKDAY = w -> {
            LocalDate result = (LocalDate) w;
            do {
                result = result.plusDays(1);
            } while (result.getDayOfWeek().getValue() >= 6);
            return result;
        };

        LocalDate backToWork = today.with(NEXT_WORKDAY);
        System.out.println("backToWork: " + backToWork);

        TemporalAdjuster NEXT_WORKDAY2 = TemporalAdjusters.ofDateAdjuster(w -> {
            LocalDate result = w; // No cast
                do {
                    result = result.plusDays(1);
                } while (result.getDayOfWeek().getValue() >= 6);
                return result;
            });
        backToWork = today.with(NEXT_WORKDAY2);
        System.out.println("backToWork: " + backToWork);
    }
}
