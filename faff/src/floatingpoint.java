import java.util.Scanner;

public class floatingpoint {
	public static void main(String[] args) {
		System.out.println("Enter the first number: ");
		Scanner scantext = new Scanner(System.in);
		Double firstNumber = scantext.nextDouble();
		System.out.println("Enter the second number: ");
		Double secondNumber = scantext.nextDouble();
		Double resultAdd = firstNumber + secondNumber;
		Double resultDiff = firstNumber - secondNumber;
		Double resultProduct = firstNumber * secondNumber;
		System.out.println("Their sum is: " + resultAdd + "\nTheir difference is: " + resultDiff + "\nTheir product is: " + resultProduct);
		scantext.close();
	}
}
