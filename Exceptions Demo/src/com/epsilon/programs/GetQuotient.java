package com.epsilon.programs;

public class GetQuotient {

	public static void main(String[] args) {

		// System.out.println(Arrays.toString(args));
		try {
			String a1 = args[0];
			String a2 = args[1];

			int n = Integer.parseInt(a1);// by default, the base is 10
			int d = Integer.parseInt(a2);
			int q = n / d;
			System.out.println("Quotient of " + n + " / " + d + " = " + q);

		} catch (Exception e) {
			System.out.println("There was a problem: " + e.getMessage());
		}

		System.out.println("End of the main !");
	}

}
