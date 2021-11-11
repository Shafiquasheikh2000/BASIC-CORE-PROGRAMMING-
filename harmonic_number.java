import java.util.Scanner;

public class Harmonic_number {
	public static void main(String[] args) {
		/* Taking input from user */
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number [N] :- ");
		float N = input.nextInt();

		/* Temporary variables */
		float num = 0;
		if(N != 0) {
			for(float j=1; j<=N; j++) {
				num += (1/j);
			}
			System.out.println("\nThe value of harmonic number of " + N + " is " + num);
		}
		else {
			System.out.println("\nEnter a valid number");
		}
	}
}
