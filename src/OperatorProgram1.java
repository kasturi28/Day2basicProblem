import java.util.Scanner;

public class OperatorProgram1 {

	public static void main(String[] args) {

		int x1 = 0;
		int x2 = 0;
		int x3 = 0;
		int x4 = 0;

		System.out.println("Enter a first number.....");
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		System.out.println("Enter a second number.....");
		int b = scanner.nextInt();
		System.out.println("Enter a third number.....");
		int c = scanner.nextInt();

		x1 = a + b * c;
		x2 = c + a / b;
		x3 = a % b + c;
		x4 = a * b + c;

		System.out.println(" " + x1);
		System.out.println(" " + x2);
		System.out.println(" " + x3);
		System.out.println(" " + x4);

		if (x1 > x2 && x1 > x3 && x1 > x4) {
			System.out.println("Maximum output = " + x1);
		} else if (x2 > x1 && x2 > x3 && x2 > x4) {
			System.out.println("Maximum output = " + x2);
		} else if (x3 > x1 && x3 > x2 && x3 > x4) {
			System.out.println("Maximum output = " + x3);
		} else {
			System.out.println("Maximum output = " + x4);
		}
		if (x1 < x2 && x1 < x3 && x1 < x4) {
			System.out.println("Minimum output = " + x1);
		} else if (x2 < x1 && x2 < x3 && x2 < x4) {
			System.out.println("Minimum output = " + x2);
		} else if (x3 < x1 && x3 < x2 && x3 < x4) {
			System.out.println("Minimum output = " + x3);
		} else {
			System.out.println("Minimum output = " + x4);
		}

	}

}
