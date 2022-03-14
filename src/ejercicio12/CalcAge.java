package ejercicio12;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class CalcAge {
	public static void main(String[] args) {
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String birthdayString = "30/11/1979";
		
		LocalDate birthday = LocalDate.parse(birthdayString, format);
		Period age = Period.between(birthday, LocalDate.now());
		
		System.out.println(String.format("%d años, %d meses,y %d días", age.getYears(), age.getMonths(), age.getDays()));
	}
}
