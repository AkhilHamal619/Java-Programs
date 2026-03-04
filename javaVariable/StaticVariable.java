package javaVariable;

public class StaticVariable 
{
	static int a = 5; //static variable
	void staticMethod()
	{
		int b=5; 	//local variable
		System.out.println("A="+a);
		System.out.println("B="+b);
		System.out.println();
		a++;
		b++;
	}
	public static void main(String[]args)
	{
		StaticVariable obj = new StaticVariable();
		obj.staticMethod();
		obj.staticMethod();
		
	}
}