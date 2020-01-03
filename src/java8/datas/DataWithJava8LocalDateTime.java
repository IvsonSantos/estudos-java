package java8.datas;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class DataWithJava8LocalDateTime {
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		LocalDateTime today = LocalDateTime.now();
		LocalDate theDate = today.toLocalDate();
		Month month = today.getMonth();
		int day = today.getDayOfMonth();
		 
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
		String formattedDateTime = today.format(formatter);
		
		System.out.println(formattedDateTime);
		
	}

}
