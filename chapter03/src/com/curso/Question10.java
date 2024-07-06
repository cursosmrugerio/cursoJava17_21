package com.curso;

import java.time.DayOfWeek;

public class Question10 {

	public static void main(String[] args) {

		//DayOfWeek dof = DayOfWeek.FRIDAY;
		
		
	}
	
	private DayOfWeek getWeekDay(int day, final int thursday) { 
		
			int otherDay = day; 
			final int Sunday = 0; 
			final int jueves = 6;
			
			switch(otherDay) { 
				default: break;
				case 1: return DayOfWeek.MONDAY;
				case jueves: return DayOfWeek.THURSDAY;
				case 2,10: break;
				// case 2: case 10: break; //JAVA 8
				case Sunday: return DayOfWeek.SUNDAY;
				case 7: return DayOfWeek.MONDAY;
			}
			
			return DayOfWeek.FRIDAY;
	}

}
