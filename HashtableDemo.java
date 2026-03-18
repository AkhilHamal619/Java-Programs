import java.util.Hashtable;
public class HashtableDemo
{
    public static void main(String[] args)
    {
        Hashtable<Integer, String> table = new Hashtable<>();

        table.put(101, "Ram");
        table.put(102, "Shyam");
        table.put(103, "Siddhartha");

        System.out.println("Hashtable Elements:");

        for(Integer key : table.keySet())
        {
            System.out.println(key + " : " + table.get(key));
        }
    }
}