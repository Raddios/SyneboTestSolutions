package solution;

import java.util.Scanner;

public class Matches {

	public static void main(String[] args) {
		int number;
		Scanner scan = new Scanner(System.in);
		number = scan.nextInt();
		if (number >= 1 && number <= 1_000_000_000) {
			MinNumberMatches(number);
		} else {
			System.out.println("Wrong number");
		}

		scan.close();
	}

	public static void MinNumberMatches(int number) {
		int length;
		int width;
		int solution;
		length = (int) Math.sqrt(number);
		width = (int) Math.floor(number / length);
		solution = 2 * number + length + width;
		if (number <= 4) {
			System.out.println(solution);
		} else {
			System.out.println(solution + 1);
		}

	}

}
