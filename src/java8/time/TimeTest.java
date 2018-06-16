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
		System.out.printf("%s anos, %s m�s e %s dias", periodo.getYears(), periodo.getMonths(), periodo.getDays());
		System.out.println();

		LocalDate hoje = LocalDate.now();
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println(hoje.format(formatador));

		// manipulando datas
		LocalDate hoje2 = LocalDate.now();
		LocalDate amanha = hoje2.plusDays(1);

		// c�lculo interessante � o n�mero de medidas de tempo at� uma determinada data
		MonthDay natal = MonthDay.of(Month.DECEMBER, 25);
		LocalDate natalDesseAno = natal.atYear(Year.now().getValue());
		long diasAteONatal = LocalDate.now().until(natalDesseAno, ChronoUnit.DAYS);

		// Podemos, por exemplo, descobrir qual � a pr�xima sexta-feira.
		TemporalAdjuster ajustadorParaProximaSexta = TemporalAdjusters.next(DayOfWeek.FRIDAY);
		LocalDate proximaSexta = LocalDate.now().with(ajustadorParaProximaSexta);

		
		// Se voc� adicionar um dia a um LocalDate, as informa��es de data n�o ser�o alteradas.
		// Isso vale para todas as classes do pacote java.time, que s�o imut�veis e, por isso, s�o thread-safe e mais f�ceis de dar manuten��o.
		LocalDate hoje3 = LocalDate.now(); //2014-04-08
		hoje3.plusDays(1);
		System.out.println(hoje3); //2014-04-08 (ainda � hoje, e n�o amanh�!)
	}

	public static void imprimeHoras() {

		Instant agoraMesmo = Instant.now();
		System.out.println("Agora:" + agoraMesmo);

		// J� a classe LocalTime serve para representar apenas um hor�rio, sem data
		// espec�fica
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
		// Se calcularmos de maneira ing�nua a dura��o do voo, ter�amos 8:40. Por�m,
		// como h� uma diferen�a entre os
		// fusos hor�rios de S�o Paulo e Nova York, a dura��o correta � 9:40.
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
