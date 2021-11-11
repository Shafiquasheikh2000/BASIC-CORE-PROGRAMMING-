import java.util.Scanner;

public class Powers_of_2 {
	public static void main(String[] args) {
		/* Taking input from user */
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number [N] :- ");
		int N = input.nextInt();

		System.out.println("\nPowers of 2 table :- \n");
		for(int i=1; i<=N; i++) {
			int power_of_2 = (int) Math.pow(2, i);

			System.out.println(power_of_2 );
		}
	}

}
