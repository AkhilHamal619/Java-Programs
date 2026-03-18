import java.util.Dictionary;
import java.util.Hashtable;

public class DictionaryExample
{
    public static void main(String[] args)
    {

        Dictionary<Integer, String> dict = new Hashtable<>();

        dict.put(1, "Java");
        dict.put(2, "Python");
        dict.put(3, "C++");

        System.out.println("Dictionary Elements:");

        for(int i = 1; i <= 3; i++)
        {
            System.out.println(i + " : " + dict.get(i));
        }
    }
}