import java.util.HashSet;

public class HashSetDemo
 {
    public static void main(String[] args)
    {

        HashSet<String> fruits = new HashSet<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Pineapple");
        fruits.add("Apple"); // Duplicate element

        System.out.println("Fruits in HashSet:");
        System.out.println(fruits);
    }
}