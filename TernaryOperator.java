//javaOperators;
//Conditional(Ternary Operators)

public class TernaryOperator 
{
	public static void main(String[]args)
	{
		int a=50, b=10, c=15, large;
		System.out.println("First num:"+a);
		System.out.println("Second num:"+b);
		System.out.println("Third num:"+c);
		large = (a>b)?(a>c?a:c) : (b>c?b:c);
		
		System.out.println("Largest num:"+large);
		
	}
}