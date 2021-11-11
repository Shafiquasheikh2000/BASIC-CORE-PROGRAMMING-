import java.util.Scanner;

public class Swapping_of_two_numbers {
	public static void main(String[] args) {
		/* Taking input from user */
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number [X] :- ");
		int X = input.nextInt();
		System.out.print("Enter a number [Y] :- ");
		int Y = input.nextInt();

		System.out.println("\nX :- " + X);
		System.out.println("Y :- " + Y);

		System.out.println("Two numbers got swapped.");

		X = X + Y;
		Y = X - Y;
		X = X - Y;

		System.out.println("X :- " + X);
		System.out.println("Y :- " + Y);
	}
}
