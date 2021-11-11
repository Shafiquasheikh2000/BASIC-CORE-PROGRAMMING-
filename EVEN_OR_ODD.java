import java.util.Scanner;

public class Even_or_odd {
	public static void main(String[] args) {
		/* Taking input from user */
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number [N] :- ");
		System.out.print(" ");
		int N = input.nextInt();

		/* calculation of even or odd */
		if(N >= 0) {
			if((N%2) == 0) {
				System.out.println("\n" + N + " is an even number.");
			}
			else {
				System.out.println("\n" + N + " is an odd number.");
			}
		}
		else {
			System.out.println("\nEnter a positive number.");
		}
	}
}
