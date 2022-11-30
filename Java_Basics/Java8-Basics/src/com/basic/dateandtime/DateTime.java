package com.basic.dateandtime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;

public class DateTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate today = LocalDate.of(2022,Month.AUGUST,15);
		System.out.println(today);
		
		LocalDateTime rightNow = LocalDateTime.now();
		System.out.println(rightNow);
		
		LocalTime t1 = LocalTime.now(ZoneId.of("CET"));
		System.out.println(t1);

	}

}
