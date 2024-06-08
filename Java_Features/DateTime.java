package Java_Features;

import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;


import java.time.LocalTime;


import java.time.LocalDateTime;

import java.time.Instant;
import java.time.Duration;

import java.time.format.DateTimeFormatter;


public class DateTime {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate jul_10 = LocalDate.of(2002, Month.JULY, 10);
        LocalDate jul_10_07 = LocalDate.of(2002, 07, 10);
        LocalDate kolkata = LocalDate.now(ZoneId.of("Asia/Kolkata"));
        LocalDate hundredThDayOf2022 = LocalDate.ofYearDay(2022, 100);

        System.out.println(today);
        System.out.println(jul_10);
        System.out.println(jul_10_07);
        System.out.println(kolkata);
        System.out.println(hundredThDayOf2022);
        System.out.println(Month.JANUARY);
        System.out.println(Month.JULY);

        System.out.println("\n\n\n\n Time");

        LocalTime time = LocalTime.now();
        LocalTime specificTime = LocalTime.of(20, 20, 42);
        LocalTime kolkataTime = LocalTime.now(ZoneId.of("Asia/Kolkata"));
        System.out.println(time);
        System.out.println(specificTime);
        System.out.println(kolkataTime);
 
        
        System.out.println("\n\n\n Local Date Time");
        LocalDateTime localDateTime= LocalDateTime.now();

        System.out.println(localDateTime);

        System.out.println("\n\n\n Instant");
        Instant timestamp = Instant.now();
        Duration thirtyDay = Duration.ofMinutes(30);
        System.out.println(timestamp);
        System.out.println(thirtyDay);

        // Date time formatter

        LocalDate date = LocalDate.now();
        System.out.println(date.format(DateTimeFormatter.ofPattern("d::MMM::uuuu")));
        System.out.println(date.format(DateTimeFormatter.ofPattern("dd::MM::yyyy")));
        System.out.println(date.format(DateTimeFormatter.BASIC_ISO_DATE));

        LocalDateTime dt =  LocalDateTime.parse("17::Jul::2002 21::39::48",
                DateTimeFormatter.ofPattern(("dd::MMM::yyyy HH::mm::ss")));
                System.out.println(dt);
    }
}
