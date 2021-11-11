import java.util.Scanner;

public class Flip_coin_1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		/* Taking input from user */
		System.out.print("Enter a number :- ");
		double no_of_flip_coins = input.nextInt();

		/* Temporary Variables */
		int head_count = 0;
		int tail_count = 0;

		for(int i=1; i<= no_of_flip_coins; i++) {
			int coin_flip = (int) Math.floor(Math.random()*2);
			if(coin_flip == 1) {
				head_count++;
			}
			else {
				tail_count++;
			}
		}
		/* calculating percentages*/

		System.out.println("\nTotal number of heads :- " + head_count);
		int head_percentage = (int) ((head_count/no_of_flip_coins)*100);
		System.out.println("Percentage of heads :- " + head_percentage + "%");

		System.out.println("\nTotal number of tails :- " + tail_count);
		int tail_percentage = (int) ((tail_count/no_of_flip_coins)*100);
		System.out.println("Percentage of tails :- " + tail_percentage + "%");
	}
}
