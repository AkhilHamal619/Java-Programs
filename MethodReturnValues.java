//Method that Return Values.
public class MethodReturnValues
{
    public static void main(String[]args)
    {
        int x = 10;
        int y = 20;

        MethodReturnValues obj = new MethodReturnValues();
        int z = obj.sum(x,y);
        System.out.println("Sum is:"+2);
    }

    public int sum(int a, int b)
    {
        int c = a + b;
        return c;
    }
}
