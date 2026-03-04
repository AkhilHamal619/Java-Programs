class Student
{
    String name;
    int id;

    // Parameterized constructor
    public Student(int i, String n) {
        id = i;
        name = n;
    }

    void display() {
        System.out.println("Id: " + id);
        System.out.println("Name: " + name);
    }
}

// Separate public class with main method
public class ParameterizedConstructor {
    public static void main(String[] args) {
        Student s1 = new Student(101, "Akhil");  // Calls parameterized constructor
        s1.display();
    }
}

