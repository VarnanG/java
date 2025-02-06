package com.wipro.java.java8;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class Adjust {

	public static void checkingAdjusters() {
		LocalDate date = LocalDate.now();
		System.out.println("The current date is "+date);
		
		//To get first day of next month
		LocalDate dayOfNextMonth = date.with(TemporalAdjusters.firstDayOfNextMonth());
		System.out.println("First day of next month :"+ dayOfNextMonth);
		
		//get next Saturday
		LocalDate nextSaturday = date.with(TemporalAdjusters.next(DayOfWeek.SATURDAY));
		System.out.println("Next Saturday from now is :"+ nextSaturday);
		
		// first day of current month
		LocalDate firstDay = date.with(TemporalAdjusters.firstDayOfMonth());
		System.out.println("First day of current month :"+ firstDay);
		
		// last day of current month
		LocalDate lastDay = date.with(TemporalAdjusters.lastDayOfMonth());
		System.out.println("Last day of current month :"+ lastDay);
		
		
		
	}
	public static void main(String[] args) {

		checkingAdjusters();
	}

}
