//No Argument Constructor
public class NoArgConstructorDemo
{

	public NoArgConstructorDemo()
	{
		System.out.println("Constructor of class A is called:");
	}
	public void display()
	{
		System.out.println("No Argument Constructor");
	}
			public static void main(String[]args)
			{
				NoArgConstructorDemo obj = new NoArgConstructorDemo();
				obj.display();
			}
	
	}
