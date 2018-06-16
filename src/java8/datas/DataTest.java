package java8.datas;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.YearMonth;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DataTest {

	public static void main(String[] args) {

		// litar todos os dias do mes
		int ano = 2014;
		int mes = 5;
		YearMonth anoMes = YearMonth.of(ano, mes);
		 
		List<LocalDate> listaDosDiasUteisDoMes =
		    Stream.iterate(anoMes.atDay(1),  data -> data.plusDays(1))
		          .limit(anoMes.lengthOfMonth())
		          .filter(data -> !data.getDayOfWeek().equals(DayOfWeek.SATURDAY) && 
		            			  !data.getDayOfWeek().equals(DayOfWeek.SUNDAY))
		          .collect(Collectors.toList());
		
		System.out.println(listaDosDiasUteisDoMes);
	}

}
