import java.util.Scanner;

public class Leap_year_2 {
	public static void main(String[] args) {
		/* Taking input from the user */
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a year [YYYY] :- ");
		int year = input.nextInt();

		if(year >= 1000 && year <= 9999) {
			if((year % 4) == 0 ) {
				if((year % 100) == 0) {
					if((year % 400) == 0) {
						System.out.println("\n" + year + " is a leap year.");
					}
					else {
						System.out.println("\n" + year + " is not a leap year.");
					}
				}
				else {
					System.out.println("\n" + year + " is a leap year.");
				}
			}
			else {
				System.out.println("\n" + year + " is not a leap year.");
			}
		}
		else {
			System.out.println("\nPlease enter only 4 digit number as input.");
		}
	}

}
