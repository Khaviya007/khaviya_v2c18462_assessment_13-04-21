package com.datetime;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class Testdate {
	public static void main(String[] args) {
		LocalDate d1=LocalDate.now();
		   System.out.println(d1);
		   
		   LocalDate d2=LocalDate.of(1996,02,02);
		   System.out.println(d2.plusDays(6));
		   
		   LocalDate d3=LocalDate.parse("1993-12-20",DateTimeFormatter.ISO_DATE);
		   System.out.println(d3);	   	  
	}
}
