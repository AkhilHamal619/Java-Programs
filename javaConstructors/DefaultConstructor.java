package javaConstructors;
class Student
{
    String name;
    int age;

    // Default constructor
    Student()
    {
        name = "Unknown";
        age = 0;
    }

    void display()
    {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args)
    {
        Student s1 = new Student();
        s1.display();
    }
}