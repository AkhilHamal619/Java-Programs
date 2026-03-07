import java.util.Scanner;
public class ClassAndObject
{
    public static void main(String[]args)
    {
        System.out.println("Main Method");
        ClassAndObject obj = new ClassAndObject();
        obj.displaySum();
    }
    void displaySum()
    {
        Scanner input  = new Scanner(System.in);
        System.out.println("Enter any two numbers:");  
        int a = input.nextInt();
        int b = input.nextInt();

        int sum = a + b;
        
        System.out.println("The sum of two numbers is:"+sum);
        
    }
}
