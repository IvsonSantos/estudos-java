package java8.time;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.MonthDay;
import java.time.Period;
import java.time.Year;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class TimeTest {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		// tempo passado
		Instant inicio = Instant.now();
		imprimeHoras();
		Instant fim = Instant.now();

		Duration duracao = Duration.between(inicio, fim);
		long tempo = duracao.toMillis();

		System.out.println("Tempo passado: " + tempo);

		LocalDate data = LocalDate.now();
		System.out.println(data);

		// calculo entre datas com localdate
		LocalDate homemNoEspaco = LocalDate.of(1961, Month.APRIL, 12);
		LocalDate homemNaLua = LocalDate.of(1969, Month.MAY, 25);

		Period periodo = Period.between(homemNoEspaco, homemNaLua);
		System.out.printf("%s anos, %s mês e %s dias", periodo.getYears(), periodo.getMonths(), periodo.getDays());
		System.out.println();

		LocalDate hoje = LocalDate.now();
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println(hoje.format(formatador));

		// manipulando datas
		LocalDate hoje2 = LocalDate.now();
		LocalDate amanha = hoje2.plusDays(1);

		// cálculo interessante é o número de medidas de tempo até uma determinada data
		MonthDay natal = MonthDay.of(Month.DECEMBER, 25);
		LocalDate natalDesseAno = natal.atYear(Year.now().getValue());
		long diasAteONatal = LocalDate.now().until(natalDesseAno, ChronoUnit.DAYS);

		// Podemos, por exemplo, descobrir qual é a próxima sexta-feira.
		TemporalAdjuster ajustadorParaProximaSexta = TemporalAdjusters.next(DayOfWeek.FRIDAY);
		LocalDate proximaSexta = LocalDate.now().with(ajustadorParaProximaSexta);

		
		// Se você adicionar um dia a um LocalDate, as informações de data não serão alteradas.
		// Isso vale para todas as classes do pacote java.time, que são imutáveis e, por isso, são thread-safe e mais fáceis de dar manutenção.
		LocalDate hoje3 = LocalDate.now(); //2014-04-08
		hoje3.plusDays(1);
		System.out.println(hoje3); //2014-04-08 (ainda é hoje, e não amanhã!)
	}

	public static void imprimeHoras() {

		Instant agoraMesmo = Instant.now();
		System.out.println("Agora:" + agoraMesmo);

		// Já a classe LocalTime serve para representar apenas um horário, sem data
		// específica
		LocalTime horaEntrada = LocalTime.of(9, 0);
		System.out.println("Hora de Entrada: " + horaEntrada);

		LocalDateTime agora = LocalDateTime.now();
		System.out.println("Agora: " + agora);
		LocalDateTime aberturaDaCopa = LocalDateTime.of(2014, Month.JUNE, 12, 17, 0);
		System.out.println("Abertura da Copa: " + aberturaDaCopa);

		// fuso horario
		ZoneId fusoHorarioDeSaoPaulo2 = ZoneId.of("America/Sao_Paulo");
		ZonedDateTime agoraEmSaoPaulo = ZonedDateTime.now(fusoHorarioDeSaoPaulo2);
		System.out.println(agoraEmSaoPaulo);

		// data de um voo
		// Se calcularmos de maneira ingênua a duração do voo, teríamos 8:40. Porém,
		// como há uma diferença entre os
		// fusos horários de São Paulo e Nova York, a duração correta é 9:40.
		ZoneId fusoHorarioDeSaoPaulo = ZoneId.of("America/Sao_Paulo");
		ZoneId fusoHorarioDeNovaYork = ZoneId.of("America/New_York");

		LocalDateTime saidaDeSaoPauloSemFusoHorario = LocalDateTime.of(2014, Month.APRIL, 4, 22, 30);
		LocalDateTime chegadaEmNovaYorkSemFusoHorario = LocalDateTime.of(2014, Month.APRIL, 5, 7, 10);

		ZonedDateTime saidaDeSaoPauloComFusoHorario = ZonedDateTime.of(saidaDeSaoPauloSemFusoHorario,
				fusoHorarioDeSaoPaulo);
		System.out.println(saidaDeSaoPauloComFusoHorario); // 2014-04-04T22:30-03:00[America/Sao_Paulo]

		ZonedDateTime chegadaEmNovaYorkComFusoHorario = ZonedDateTime.of(chegadaEmNovaYorkSemFusoHorario,
				fusoHorarioDeNovaYork);
		System.out.println(chegadaEmNovaYorkComFusoHorario); // 2014-04-05T07:10-04:00[America/New_York]

		Duration duracaoDoVoo = Duration.between(saidaDeSaoPauloComFusoHorario, chegadaEmNovaYorkComFusoHorario);
		System.out.println(duracaoDoVoo); // PT9H40M

	}
}
