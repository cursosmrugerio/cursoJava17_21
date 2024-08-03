package chapter04;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class Question20 {

	public static void main(String[] args) {

		var date = LocalDate.of(2022, Month.MARCH, 13); 
		var time = LocalTime.of(1, 30); 
		var zone = ZoneId.of("US/Eastern"); 
		var dateTime1 = ZonedDateTime.of(date, time, zone); 
		
		System.out.println(dateTime1);
		//2022-03-13T01:30-05:00[US/Eastern]
		
		var dateTime2 = dateTime1.plus(1, ChronoUnit.HOURS);
		//2022-03-13T03:30-04:00[US/Eastern]
		System.out.println(dateTime2);
		
		long diff = ChronoUnit.HOURS.between(dateTime1, dateTime2);
		System.out.println("diff = " + diff);
		
		int hour = dateTime2.getHour();
		System.out.println("hour = " + hour);
		
		
		System.out.println(dateTime1.getOffset());
		boolean offset = dateTime1.getOffset() == dateTime2.getOffset();
		System.out.println("offset = " + offset);
		
	}

}
