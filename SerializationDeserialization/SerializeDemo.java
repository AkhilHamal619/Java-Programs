//Serializable Program
package SerializationDeserialization;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializeDemo
{
    public static void main(String[] args)
    {
        try
        {
            Student s1 = new Student(101, "Akhil");

            FileOutputStream file = new FileOutputStream("student.ser");
            ObjectOutputStream out = new ObjectOutputStream(file);

            out.writeObject(s1);

            out.close();
            file.close();

            System.out.println("Object Serialized Successfully");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}