package Lab_Report;
public class NestedInnerClass
{
    String uniName = "Tribhuvan University";

    class Student
    {
        void show()
        {
            System.out.println("University Name: " + uniName);
        }
    }

    public static void main(String[] args)
    {
        NestedInnerClass u = new NestedInnerClass();          // outer class object
        NestedInnerClass.Student s = u.new Student();        // inner class object
        s.show();
    }
}