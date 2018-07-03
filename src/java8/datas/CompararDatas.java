package java8.datas;

import java.time.LocalDate;

public class CompararDatas {

	public static void main(String[] args) {
		
		LocalDate today = LocalDate.now();
		LocalDate date1 = LocalDate.of(2019, 7, 3);
		if (date1.equals(today)) {
		    System.out.printf("Today %s and date1 %s are same date %n", today, date1);
		}
		
		if (date1.isBefore(today)) {
			System.out.printf("Antes");
		}
		
		if (date1.isAfter(today)) {
			System.out.printf("Depois");
		}
		
	}
}
