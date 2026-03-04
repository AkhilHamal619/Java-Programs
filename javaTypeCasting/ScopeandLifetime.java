package javaTypeCasting;

public class ScopeandLifetime 
{
	public static void main(String[]args)
	{
		int a = 10;
		if(a==10)
		{
			int b = 20;
			System.out.println("A is equal");
			a = b+5;
		}
		System.out.println("value of A = "+a);
		//System.out.println("value of B ="+b); (not possible)
	}
}