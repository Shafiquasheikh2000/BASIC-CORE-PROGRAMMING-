import java.util.Scanner;

public class Quotient_and_remainder {
	public static void main(String[] args) {
		/* Taking input from user */
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number [DIVIDEND] :- ");
		float DIVIDEND = input.nextInt();

		System.out.print("Enter a number [DIVISOR] :- ");
		float DIVISOR = input.nextInt();


		/* Quotient and remainder calculation */

		float quotient = DIVIDEND / DIVISOR;
		float remainder = DIVIDEND % DIVISOR;

		System.out.println("\nThe quotient is :- " + quotient);
		System.out.println("\nThe remainder is :- " + remainder);

	}
}

