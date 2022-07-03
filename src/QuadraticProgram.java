import java.util.Scanner;

public class QuadraticProgram {

	public static void main(String[] args) {

		int delta;

		System.out.println("Enter a coefficient of square of x.....");
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		System.out.println("Enter a coefficient of x.....");
		int b = scanner.nextInt();
		System.out.println("Enter a constant.....");
		int c = scanner.nextInt();

		delta = (b * b) - (4 * a * c);

		int root1 = (-b + Math.abs(delta)) / (2 * a);
		int root2 = (-b - Math.abs(delta)) / (2 * a);

		System.out.println("roots of the quadratic equation are " + root1 + root2);

	}

}
