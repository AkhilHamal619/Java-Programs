import java.util.Iterator;
import java.util.Vector;

public class VectorClass
{
    public static void main(String[] args)
    {
        Vector vector = new Vector();

        System.out.println("Capacity of vector: " + vector.capacity());

        vector.add("Akhil");
        vector.add("Hamal");
        vector.add(10);
        vector.add(1,20);

        System.out.println(vector);

        System.out.println("Size of vector: " + vector.size());

        for(int i = 0; i < vector.size(); i++)
        {
            System.out.println("Vector elements are: "+i + ":" +vector.get(i));
        }

        System.out.println();

        Iterator it = vector.iterator();

        while(it.hasNext())
        {
            System.out.println(it.next());
        }
    }
}