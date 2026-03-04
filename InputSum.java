//WAP to input and enter the sum of 2 numbers.
import java.util.Scanner;

public class InputSum {
	public static void main(String[]args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a first no:");
		int num1 = input.nextInt();
		System.out.println("Enter a second no:");
		int num2 = input.nextInt();
		int sum = num1 + num2;
		System.out.println("Sum is:"+sum);
	}
}
