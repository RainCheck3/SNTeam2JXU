package com.sapient.client.cui;

import java.util.Calendar;

public class CalendarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar rightNow = Calendar.getInstance();

		System.out.println(rightNow.get(Calendar.MONTH));

		System.out.println(rightNow.get(Calendar.YEAR));
	}

}
