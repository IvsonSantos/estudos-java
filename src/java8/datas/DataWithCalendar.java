package java8.datas;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DataWithCalendar {
	
	public static void main(String[] args) {
		
		final String DATE_FORMAT = "dd/MM/yyyy hh:mm:ss.SSS";
		SimpleDateFormat formatter = new SimpleDateFormat(DATE_FORMAT);
		 
		long milliSeconds = System.currentTimeMillis();
		 
		Calendar calendar = Calendar.getInstance();
		calendar.setTimeInMillis(milliSeconds);
		 
		String timeStr = formatter.format(calendar.getTime());
		System.out.println(timeStr);
	}

}
