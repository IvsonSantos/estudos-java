package java8.datas;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DataWithDate {

	public static void main(String[] args) {
		
		final String DATE_FORMAT = "dd/MM/yyyy hh:mm:ss.SSS";
		SimpleDateFormat formatter = new SimpleDateFormat(DATE_FORMAT);
		 
		Date currentDate = new Date();
		 
		String timeStr = formatter.format(currentDate);
		System.out.println(timeStr);
	}
}
