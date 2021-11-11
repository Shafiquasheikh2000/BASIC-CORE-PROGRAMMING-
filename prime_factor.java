import java.util.Scanner;

public class Prime_factors {
	public static void main(String[] args){

		/*Taking input from user */
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number [N] :- ");
		int N = input.nextInt();

		System.out.println("\nThe prime factors of " + N + " are :- ");
		for(int i=2; i*i<=N; i++){
			if((N%i) == 0){
				System.out.println(i);
				N /= i;
			}
			else{
				continue;
			}
		}
		System.out.println(N);
	}
}
