import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListDemo
{
    public static void main(String[] args)
    {
        ArrayList<String> arrayList = new ArrayList<String>();

        System.out.println("Array size is " + arrayList.size());

        arrayList.add("Akhil");
        arrayList.add("Ram");
        arrayList.add("Shyam");
        arrayList.add("Hari");
        arrayList.add("Narayan");
        arrayList.add("Govind");

    System.out.println("Array size is: " + arrayList.size());

    //array List ("Akhil");
    //array List.clear();

    Collections.sort(arrayList);
    System.out.println(arrayList);

    Iterator it = arrayList.iterator();

    while (it.hasNext()) {
        System.out.println(it.next());
        }

    System.out.println("After while loop");

    for (int i = 0; i < arrayList.size(); i++) {
        System.out.println(arrayList.get(i));
        }
    }
}
