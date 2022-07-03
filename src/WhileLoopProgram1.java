import java.util.Scanner;

public class WhileLoopProgram1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter a number upto which addition value required...");

		int sum = 0;
		int x = 1;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		while (x <= n) {
			sum = sum + x;
			x++;
		}
		System.out.println("The addition of Natural numbers = " + sum);
	}

}
