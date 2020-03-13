package com.epsilon.programs;

import java.util.Date;

import com.epsilon.util.Operations;

public class UseOperations {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {

		Operations<Integer> op1 = new Operations<Integer>();
		op1.add(100, 200);

		Operations<String> op2 = new Operations<String>();
		op2.add("Faraz", "Hussain");

		Date d1 = new Date();
		Date d2 = new Date(74, 0, 20);

		Operations<Date> op3 = new Operations<Date>();
		op3.add(d1, d2);

	}

}
