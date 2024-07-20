package com.chapter04;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class Question20 {

	public static void main(String[] args) {
		var date = LocalDate.of(2022, Month.MARCH, 13);
		var time = LocalTime.of(1, 30);
		var zone = ZoneId.of("US/Eastern");
		var dateTime1 = ZonedDateTime.of(date, time, zone);
		var dateTime2 = dateTime1.plus(1, ChronoUnit.HOURS);

		System.out.println("dateTime1: " + dateTime1);
		System.out.println("dateTime2: " + dateTime2);

		long diff = ChronoUnit.HOURS.between(dateTime1, dateTime2);

		System.out.println(diff);

		int hour = dateTime2.getHour();
		System.out.println(hour);

		System.out.println("******");
		System.out.println(dateTime1.getOffset()); // -05:00
		System.out.println(dateTime2.getOffset()); // -04:00

		boolean offset = dateTime1.getOffset() == dateTime2.getOffset();

		System.out.println("diff = " + diff); //1
		System.out.println("hour = " + hour); //3
		System.out.println("offset = " + offset); //false

	}

}
