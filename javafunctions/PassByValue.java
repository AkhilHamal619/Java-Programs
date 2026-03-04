package javafunctions;

public class PassByValue {

	public static void main(String[]args)
	{
		int a =10;
		System.out.println("Before calling:"+a);
		PassByValue obj = new PassByValue();
		obj.ChangeValue(a);
		System.out.println("after calling:"+a);
	}
	void ChangeValue(int b)
	{
		b = 20;
		System.out.println("Inside method:"+b);

		
	}
}
