package faff;
import java.util.Scanner;

public class anotherfile {
	public static void main(String[] args) {
        int num1 = 12, num2 = 4, num3 = 14, num4 = 6;
        double val1 = 3.0;

        double result1 = 2 + num1 / num2;
        int result2 = (num4 +1) % num2;
        int result3 = 5 + (int) (3+ val1) / 2;
        double result4 = (double) (13/(num4 -4));
        double result5 = ((double) (num3+1) / 2);

        System.out.println (result1);
        System.out.println (result2);
        System.out.println (result3);
        System.out.println (result4);
        System.out.println (result5);

        int x = 2, y = 5;
        double z = 7.3;

        System.out.println(x = 8 - ++y);
        System.out.println(y = (x++) + 3);
        System.out.println(z = 2 * (++y) + (int) (z));
        System.out.println(y = 2*  (++x) + (y++) + x++);
        
        System.out.println("Enter the length in centimetres: ");
		Scanner scantext = new Scanner(System.in);
        Double result = scantext.nextDouble();
        System.out.println("In inches, that's " + (result * 0.3937));

        System.out.println("Enter a temperature in Fahrenheit: ");
        result = scantext.nextDouble();
        System.out.println("In celsius, that's " + ((result - 32) * (5.0/9)));

    }
}