package Lab_Report;
import java.util.Scanner;

public class SmallestNumber
{
    public static void main(String first[])
    {
        Scanner input=new Scanner(System.in);
        System.err.print("First number:");
        int d=input.nextInt();
        System.err.print("Second number:");
        int e=input.nextInt();
        System.err.print("third number:");
        int f=input.nextInt();
        int smallest;
        if(d<e && d<f)
        {
            smallest=d;
        }
        else if(e<d && e<f)
        {
            smallest=e;
        }
        else
        {
            smallest=f;
        }
        System.err.println("The smallest number:"+smallest);
        input.close();
        
    }
}