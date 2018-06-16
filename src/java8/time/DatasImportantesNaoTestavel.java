package java8.time;

import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class DatasImportantesNaoTestavel {

	public LocalDate diaDoProgramadorDesseAno(){
		//como fazer para testar uma data do passado, por exemplo, de 2012?
		return LocalDate.now().with(TemporalAdjusters.firstDayOfYear()).plusDays(255);
	}
}
