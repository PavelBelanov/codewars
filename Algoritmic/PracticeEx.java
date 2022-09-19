package Algoritmic;

import java.time.*;

public class PracticeEx {
    public static void main(String[] args) {
        ZoneId zone = ZoneId.of("Africa/Cairo");
        ZonedDateTime cairoTime = ZonedDateTime.now(zone);

        LocalDate localDate = cairoTime.toLocalDate();
        LocalTime localTime = cairoTime.toLocalTime();
        LocalDateTime localDateTime = cairoTime.toLocalDateTime();
        System.out.println(localDate);
        System.out.println(localTime);
        System.out.println(localDateTime);
    }
}
