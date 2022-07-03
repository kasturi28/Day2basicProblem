import java.util.Scanner;

public class SpringSeasonProgram {

	public static void main(String[] args) {

		System.out.println("Enter a date.....");
		Scanner scanner = new Scanner(System.in);
		int d = scanner.nextInt();
		System.out.println("Enter a month number.....");
		int m = scanner.nextInt();

		if ((m == 3 && d >= 20 && d <= 31) || (m == 4 && d >= 1 && d <= 30) || (m == 5 && d >= 1 && d <= 31)
				|| (m == 6 && d >= 1 && d <= 20)) {
			System.out.println("TRUE");
		} else {
			System.out.println("FALSE");
		}

	}

}
