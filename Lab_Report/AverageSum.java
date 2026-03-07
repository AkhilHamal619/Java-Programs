package Lab_Report;
import java.util.Scanner;
public class AverageSum
{
    public static void main(String[] gaurav)
    {
        Scanner input=new Scanner(System.in);
        System.err.println("Enter the first elements:");
        int a=input.nextInt();
        System.err.println("Enter the secondelements:");
        int b=input.nextInt();
        System.err.println("Enter the third elements:");
        int c=input.nextInt();
        int sum=a+b+c;
        int average=sum/3;
        System.out.println("Sum is:"+sum);
        System.out.println("Average is:"+average);
        input.close();

    }
}