package java8.datas;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class DataAtual {

	public static void main(String[] args) {
		
		// java 7
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = new Date();
		System.out.println(dateFormat.format(date)); //2015/10/26 12:10:39
		
		// java 8
		LocalDate today = LocalDate.now();
		System.out.println(today);
	}
}
