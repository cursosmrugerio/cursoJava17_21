package chapter04;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Question03 {

	public static void main(String[] args) {

		var zone = ZoneId.of("US/Eastern"); 
		
		//var date = LocalDate.of(2022, 3, 13); 
		//var date = LocalDate.of(2022, 3, 40); 
		//var date = LocalDate.of(2022, 11, 6); 
		//var date = LocalDate.of(2022, 11, 7);
		//var date = LocalDate.of(2023, 2, 29);
		
		var date = LocalDate.of(2022, Month.MARCH, 13);
		
		var time = LocalTime.of(2, 15); 
		var z = ZonedDateTime.of(date, time, zone);
		
		System.out.println(z);
	}

}
