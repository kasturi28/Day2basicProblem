import java.util.Scanner;

public class ForLoopProgram2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter a number...");

		int rev = 0;
		int rem = 0;
		Scanner sc = new Scanner(System.in);
		

		for (int n = sc.nextInt(); n > 0; n = n / 10) {
			rem = n % 10;
			rev = rev * 10 + rem;
		}

		System.out.println("The reverse number is " + rev);
	}

}
