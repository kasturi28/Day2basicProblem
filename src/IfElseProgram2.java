import java.util.Scanner;

public class IfElseProgram2 {

	public static void main(String[] args) {

		System.out.println("Please enter a number..");

		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();

		if (x == 1) {
			System.out.println("Unit...");
		} else if (x == 10) {
			System.out.println("Ten...");
		} else if (x == 100) {
			System.out.println("Hundred...");
		} else if (x == 1000) {
			System.out.println("Thousand...");
		} else {
			System.out.println("Please enter a valid number...");
		}

	}
}