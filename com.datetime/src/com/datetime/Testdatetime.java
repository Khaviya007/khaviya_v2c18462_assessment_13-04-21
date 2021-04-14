package com.datetime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class Testdatetime {
	public static void main(String[] args) {
		LocalDateTime dt1= LocalDateTime.of(2020, 07, 15, 03, 56);
		LocalDateTime dt2=dt1.plusDays(7).plusMonths(2);
		System.out.println(dt2.format(DateTimeFormatter.ISO_DATE_TIME));
	}
}
