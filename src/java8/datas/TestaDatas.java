package java8.datas;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class TestaDatas {

	public static void main(String[] args) {
		
		final String DATE_FORMAT = "dd/MM/yyyy hh:mm:ss";
        SimpleDateFormat simpleDateformatter = new SimpleDateFormat(DATE_FORMAT);
        DateTimeFormatter dateTimeformatter = DateTimeFormatter.ofPattern(DATE_FORMAT);
         
        //Using Date Object
        Date currentDateObj = new Date();
        String dateString = simpleDateformatter.format(currentDateObj);
        System.out.println(dateString);
         
        //Using Calendar Instance
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        String timeString = simpleDateformatter.format(calendar.getTime());
        System.out.println(timeString);
         
        //Using LocalDateTime
        LocalDateTime localDateTime = LocalDateTime.now();
        String localDateTimeString = dateTimeformatter.format(localDateTime);
        System.out.println(localDateTimeString);
         
        //Using LocalDate
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
         
        //Using LocalTime
        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);
         
        //In different Timezone
        ZoneId id = ZoneId.of("Europe/Paris");
        ZonedDateTime zonedDateTime = ZonedDateTime.of(localDateTime, id);
        String zonedDateTimeString = dateTimeformatter.format(zonedDateTime);
        System.out.println(zonedDateTimeString);
	}
}
