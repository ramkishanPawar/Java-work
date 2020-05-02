
public class Factorial {

	// Factorial method

	public static long fact(int n) {

		// base condition

		if (n == 1 || n == 0)
			return 1;

		// another condition
		return n * fact(n - 1);

	}

	public static void main(String[] args) {

		/*
		 * // taking command line argument 
		 * int input = Integer.parseInt(args[0]);
		 */

		int input = 5;

		long factorial = fact(input); // method calling

		System.out.println("The factorial of number " + input + " is: " + factorial);

	}

}
