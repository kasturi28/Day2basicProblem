import java.util.Scanner;

public class DistanceProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double distance;
		System.out.println("Enter a first number.....");
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		System.out.println("Enter a second number.....");
		int b = scanner.nextInt();
		distance = Math.sqrt(a * a + b * b);
		System.out.println("Distance = " + distance);

	}

}
