package ExceptionHandling;
public class ExceptionTryCatch 
{
    public static void main(String[]args)
    {
        int a = 10;
        int b = 0;
        int c;
        try
        {
            c = a/b;
            System.out.println("This will not be printed");
        }
        catch(ArithmeticException e)
        {
            System.out.println("Divison by zero");
            System.out.println(e.getMessage());
        }
        finally
        {
            System.out.println("This is finally block");
        }

        try
        {
            int arr[] = {10,20,30,40};
            System.out.println(arr[6]);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Divison by zero");
             System.out.println(e.getMessage());
        }
    }    
}
