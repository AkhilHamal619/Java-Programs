package finalKeyword;

public class finalVariable
{
    public static void main(String[]args)
    {
        final int a = 10;
        System.out.println(a);
        int b = 20;
        System.out.println(b);
        b = 30;
        System.out.println(b);
        int a = 20; //Error as a variable is already intialized using final keyword so, it becomes constant variable.
        System.out.println(a);
    }    
}
