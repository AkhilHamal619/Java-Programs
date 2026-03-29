import java.util.Scanner;
public class RecursionFactorial 
{

	public static void main(String[]args)
	{
		int n,f;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter any no:");
		n = input.nextInt();
		
		f = fact(n);
		System.out.println("The factorial is:"+f);
	}
	static int fact(int n)
	{
		if (n<=1)
			return 1;
		else 
			return n*fact(n-1);
	}
}
