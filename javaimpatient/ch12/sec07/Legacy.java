package ch12.sec07;

import java.sql.Time;
import java.sql.Timestamp;
import java.text.MessageFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.GregorianCalendar;

public class Legacy {
    public static void main(String[] args) {
        System.out.println("java.util.Date <-> Instant");
        System.out.println(new java.util.Date().toInstant());
        System.out.println(java.util.Date.from(Instant.now()));

        System.out.println("GregorianCalendar <-> ZonedDateTime");
        System.out.println(new GregorianCalendar().toZonedDateTime());
        System.out.println(GregorianCalendar.from(ZonedDateTime.now()));

        Timestamp christmas = Timestamp.valueOf("2014-12-25 18:30:00");
        System.out.println("java.sql.Timestamp <-> Instant");
        System.out.println(christmas.toInstant());
        System.out.println(Timestamp.from(Instant.now()));   

        System.out.println("java.sql.Timestamp <-> LocalDateTime");
        System.out.println(christmas.toLocalDateTime());
        System.out.println(Timestamp.valueOf(LocalDateTime.now()));   

        System.out.println("java.sql.Date <-> LocalDate");
        System.out.println(java.sql.Date.valueOf("2014-12-25").toLocalDate());
        System.out.println(java.sql.Date.valueOf(LocalDate.now()));   

        System.out.println("java.sql.Time <-> LocalTime");
        System.out.println(Time.valueOf("18:30:00").toLocalTime());
        System.out.println(Time.valueOf(LocalTime.now()));   
      
        System.out.println("DateTimeFormatter -> DateFormat");
        MessageFormat message = new MessageFormat("Today is {0}.");
        message.setFormat(0, DateTimeFormatter.ISO_WEEK_DATE.toFormat());
        System.out.println(message.format(new Object[] { LocalDate.now() }) );
    } 
}
