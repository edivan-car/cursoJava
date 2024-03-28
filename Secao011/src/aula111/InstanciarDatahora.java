package aula111;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class InstanciarDatahora {

	public static void main(String[] args) {
		
		// DateTimeFormatter
		// https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/format/DateTimeFormatter.html
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		LocalDate d01 = LocalDate.now(); // pegar data do sistema
		LocalDateTime d02 = LocalDateTime.now(); // data-hora do sistema
		Instant d03 = Instant.now(); // data-hora do sistema em formato global
		
		LocalDate d04 = LocalDate.parse("2022-08-03"); // data padrão ISO 8601
		LocalDateTime d05 = LocalDateTime.parse("2022-08-03T14:44:51"); // data-hora ISO 8601
		Instant d06 = Instant.parse("2022-08-03T14:44:51Z"); // data-hora ISO 8601
		Instant d07 = Instant.parse("2022-08-03T14:44:51-03:00"); // data-hora GMT-3
		
		LocalDate d08 = LocalDate.parse("03/08/2022", fmt1);
		LocalDateTime d09 = LocalDateTime.parse("03/08/2022 14:56", fmt2);

		LocalDate d10 = LocalDate.of(2022, 8, 03);
		LocalDateTime d11 = LocalDateTime.of(2022, 8, 03, 15, 00);
		
		System.out.println("d01 = " + d01);
		System.out.println("d02 = " + d02);
		System.out.println("d03 = " + d03);
		System.out.println("d04 = " + d04);
		System.out.println("d05 = " + d05);
		System.out.println("d06 = " + d06);
		System.out.println("d07 = " + d07);
		System.out.println("d08 = " + d08);
		System.out.println("d09 = " + d09);
		System.out.println("d10 = " + d10);
		System.out.println("d11 = " + d11);

	}

}
