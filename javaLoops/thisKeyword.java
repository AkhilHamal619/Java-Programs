package javaLoops;

class Student
{
    int id;
    String name;
    int age;
    public Student(int id, String name, int age)
    {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public void display()
    {
        System.out.println("ID:"+id + "\t" + "Name:"+name + "\t" + "Age:"+age);
    }
}

public class thisKeyword
{
    public static void main(String[]args)
    {
        Student student = new Student(101, "Akhil", 22);
        Student student1 = new Student(102, "Anjan", 18);
        student.display();
        student1.display();
    }
}
