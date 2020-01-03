package java8.datas;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class LocalDateTest {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		// construtor
		LocalDate date = LocalDate.of(2014, 12, 25);
		LocalDateTime dateTime = LocalDateTime.of(2014, 12, 25, 10, 30);

		// Para modificar o ano de
		// um LocalDate, por exemplo, poderíamos utilizar o método withYear.
		LocalDate dataDoPassado = LocalDate.now().withYear(2008);

		System.out.println(dataDoPassado);

		// ano e mes
		YearMonth ym = YearMonth.from(dataDoPassado);
		System.out.println(ym.getMonth() + " " + ym.getYear());

		// locale para mostrar o nome do mes inteiro
		Locale pt = new Locale("pt");
		System.out.println(Month.DECEMBER.getDisplayName(TextStyle.FULL, pt));

		// formatar a data
		LocalDateTime agora = LocalDateTime.now();
		String resultado = agora.format(DateTimeFormatter.ISO_LOCAL_TIME);
		System.out.println(resultado);

		LocalDateTime agora2 = LocalDateTime.now();
		agora2.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		System.out.println(agora2);

		// dias entre datas
		LocalDate agora3 = LocalDate.now();
		LocalDate outraData = LocalDate.of(2018, Month.JANUARY, 25);
		long dias = ChronoUnit.DAYS.between(outraData, agora3);
		System.out.println(dias);
		
		// PERIOD para calculo entre datas
		// DURATION para calculo entre horas
		LocalDateTime agora4 = LocalDateTime.now();
		LocalDateTime daquiAUmaHora = LocalDateTime.now().plusHours(1);
		Duration duration = Duration.between(agora4, daquiAUmaHora);
		if (duration.isNegative()) {
			duration = duration.negated();
		}
		System.out.printf("%s horas, %s minutos e %s segundos", duration.toHours(), duration.toMinutes(),
				duration.getSeconds());
	}

}
