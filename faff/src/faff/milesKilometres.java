package faff;

import java.util.Scanner;

public class milesKilometres {
	public static void main(String[] args) {
		System.out.println("Enter the distance in miles: ");
		Scanner scantext = new Scanner(System.in);
		Double firstNumber = scantext.nextDouble();
		Double result = firstNumber * 1.60935;
		System.out.println("That distance in kilometres is: " + result);
	}
}
