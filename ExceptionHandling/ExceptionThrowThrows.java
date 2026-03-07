//Using Scanner for try and catch.
package ExceptionHandling;
import java.util.Scanner;

public class ExceptionThrowThrows 
{
    public void readAge(int age) throws Exception
    {
        if(age<15 || age>60)
             throw new Exception();
        else
            System.out.println(age);
    }
    public static void main(String[]args)
    {   
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter your Age:");
        int age = input.nextInt();

        ExceptionThrowThrows obj = new ExceptionThrowThrows();
        try
        {
            obj.readAge(age);
        }
        catch(Exception e)
        {
            System.out.println(age);
        }
    }
}
