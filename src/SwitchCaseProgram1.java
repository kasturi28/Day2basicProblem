import java.util.Scanner;

public class SwitchCaseProgram1 {

	public static void main(String[] args) {

		System.out.println("Enter an alphabet.....");
		Scanner scanner = new Scanner(System.in);
		char check = scanner.next().charAt(0);

		switch (check) {
		case 'a' | 'A':
			System.out.println("Entered alphabet is vowel...");
			break;
		case 'e' | 'E':
			System.out.println("Entered alphabet is vowel...");
			break;
		case 'i' | 'I':
			System.out.println("Entered alphabet is vowel...");
			break;
		case 'o' | 'O':
			System.out.println("Entered alphabet is vowel...");
			break;
		case 'u' | 'U':
			System.out.println("Entered alphabet is vowel...");
			break;
		default:
			System.out.println("Entered alphabet is consonant...");
			break;
		}

	}

}
