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

		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("Two Inputs Expected!" + e.getMessage());
		} catch (NumberFormatException e) {
			System.err.println("Only Integer Values are allowed!");
			// return;
			// System.exit(12);
		} catch (Exception e) {// fallback/default:must always be the last one
			System.err.println("Two inputs Expected!");
		} finally {
			System.out.println("This works in most cases!");// Avoid using Finally
		}

		System.out.println("End of the main !");
	}

}
