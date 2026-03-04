public class PrivateConstructor 
{
	String name;
	int age;
	
	private PrivateConstructor()
	{
		name = "Akhil";
		age = 22;
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
		System.out.println();
	}
	public static void main(String[]args)
	{
		PrivateConstructor obj = new PrivateConstructor();
	}
	
}

