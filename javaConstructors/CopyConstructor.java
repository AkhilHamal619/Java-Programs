package javaConstructors;
class Student
{
    String name;
    int age;

    Student()
    {
        name = "Akhil";
        age = 20;
    }
    
    public Student(Student ref)
    {
        name = ref.name;
        age = ref.age;
    }

    void display()
    {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println();
    }
}

public class CopyConstructor 
{
    public static void main(String[] args)
    {
        Student obj = new Student();       // default constructor
        Student obj1 = new Student(obj);   // copy constructor
        
        obj.display();
        obj1.display();
    }
}