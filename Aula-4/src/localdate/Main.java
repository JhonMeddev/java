package localdate;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalDate dataHoje = LocalDate.now();
		
		System.out.println(dataHoje);
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy - EEEE");
		
		System.out.println(dataHoje.format(formatador));
	}

}
