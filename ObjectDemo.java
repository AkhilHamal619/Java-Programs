public class ObjectDemo {

	public static void main(String[]args)
	{
		Object s = new String("Java Programming");
		Object i = new Integer(10);
		Object d = new Double(10.99);
		Object f = new Float(99.99);
		
		Class ss = s.getClass();
		Class ii= i.getClass();
		Class dd = d.getClass();
		Class ff = f.getClass();
		
		
		
		System.out.println(s);
		System.out.println(i);
		System.out.println(d);
		System.out.println(f);
		
	
	}
}