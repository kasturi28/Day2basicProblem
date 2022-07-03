import java.util.Scanner;

public class ForLoopProgram3 {

	public static void main(String[] args) {

		System.out.println("Please enter a number...");

		int rev = 0;
		int rem = 0;
		int x= 0;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		x = n;

		for ( ; n > 0; n = n / 10) {
			rem = n % 10;
			rev = rev * 10 + rem;
			
		}

		if (x == rev) {
			System.out.println("The number is palindrome number..");
		} else {
			System.out.println("The number is not palindrome number..");
		}

	}

}
