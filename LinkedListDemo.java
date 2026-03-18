import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {

        LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.add(102);
        linkedList.add(100);
        linkedList.add(101);
        linkedList.add(105);
        linkedList.add(107);

        // Using Iterator
        Iterator<Integer> itr = linkedList.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        // Using for-each loop
        for (Integer value : linkedList) {
            System.out.println(value);
        }
    }
}