class Student
{
	int id;
	String name;

public Student(int id, String name)
{
	this.id= id;
	this.name = name;
}
	void display()
	{
		System.out.println("Id:" +id + ", Name:" +name);
	}
}
public class ThisKeyword
{
	public static void main(String[]args)
	{
		Student s1 = new Student(102,"Akhil");
		Student s2 = new Student(104,"Gaurav");
		s1.display();
		s2.display();
	}
}