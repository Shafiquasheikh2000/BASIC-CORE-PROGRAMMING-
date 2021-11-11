import java.util.Scanner;

public class Vowel_or_consonent {
	public static void main(String[] args) {
		/* Taking input from user */
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an Alphabet :- ");
		String alphabet = input.nextLine();

		/* finding that the alphabet is vowel or consonent */

		char digit = alphabet.charAt(0); // changing string to char

		if(alphabet.length() == 1) {
			if(digit == 'a' || digit == 'e' || digit == 'i' || digit == 'o' || digit == 'u' ||
			   digit == 'A' || digit == 'E' || digit == 'I' || digit == 'O' || digit == 'U') 
			{
				System.out.println("\n" + alphabet + " is vowel.");
			}
			else
			{
				System.out.println("\n" + alphabet + " is consonent.");
			}
		}
		else {
			System.out.println("\nEnter only single digit alphabet.");
		}
	}
}
