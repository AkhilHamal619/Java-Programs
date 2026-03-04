class SuperKeyMethod1
{
	public SuperKeyMethod1()
	{
		System.out.println("This is parent class");
	}
}

class SuperKeyMethod2 extends SuperKeyMethod1
{
    public SuperKeyMethod2()
    {
    	super();
        System.out.println("This is child class");
    }
}

public class SuperKeyMethod
{
    public static void main(String[] args)
    {
        SuperKeyMethod2 obj = new SuperKeyMethod2();
       
    }
}

