import java.util.Scanner;

public class WhileProgram2 {

	public static void main(String[] args) {

		System.out.println("Please enter a number...");

		int rev = 0;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		while (n > 0) {

			rev = n % 10;

			System.out.print(rev);

			n = n / 10;
		}

	}
}