//Copy Constructor
class Student
{
	String name;
	int age;
	
	public Student(int a,String n)
	{
		name=n;
		age=a;
	}
	public Student(Student ref)
	{
		name= ref.name;
		age = ref.age;
	}
	void display()
	{
		System.out.println("Name:" +name + "Age:"+age);		
		
	}

}
public class CopyConstructor 
{
    public static void main(String[]args)
	{
		Student obj1 = new Student(22, "Akhil");
		Student obj2 = new Student(obj1);
		obj1.display();
		obj2.display();
	}
}
