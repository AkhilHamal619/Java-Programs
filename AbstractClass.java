abstract class AbstractDemo
{
	abstract void display();
	abstract void sum(int a, int b);	
}

public class AbstractClass extends AbstractDemo
{
	void display()
	{
		System.out.println("Example of abstract keyword");
	}
	
	void sum(int a, int b)
	{
		int z = a+b;
		System.out.println(z);
	}
	public static void main(String[]args)
	{
		AbstractClass obj = new AbstractClass();
		obj.display();
		obj.sum(10, 20);
	}
	
}