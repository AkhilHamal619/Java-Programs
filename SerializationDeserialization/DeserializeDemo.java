//Deserializable Program
package SerializationDeserialization;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserializeDemo
{
    public static void main(String[] args)
    {
        try
        {
            FileInputStream file = new FileInputStream("student.ser");
            ObjectInputStream in = new ObjectInputStream(file);

            Student s = (Student) in.readObject();

            System.out.println("ID: " + s.id);
            System.out.println("Name: " + s.name);

            in.close();
            file.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}