import java.util.List;
import java.util.ArrayList;

public class ListInterfaceDemo
{
    public static void main(String[] args)
    {

        List<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        System.out.println("Numbers in the list:");

        for(int num : numbers){
            System.out.println(num);
        }
    }
}