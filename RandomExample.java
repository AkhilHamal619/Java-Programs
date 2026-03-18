//Random Number Generation
import java.util.Random;

public class RandomExample
{
    public static void main(String[] args)
    {

        Random rand = new Random();

        int number = rand.nextInt(100); // Random number between 0 and 99
        double decimal = rand.nextDouble();
        float num = rand.nextFloat();

        System.out.println("Random Integer: " + number);
        System.out.println("Random Double: " + decimal);
        System.out.println("Random Float: "+num);
    }
}