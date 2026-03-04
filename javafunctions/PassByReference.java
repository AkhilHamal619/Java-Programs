package javafunctions;

public class PassByReference 
{
    int a = 10;   // instance variable

    public static void main(String[] args)
    {
        PassByReference obj = new PassByReference();

        System.out.println("Before Change: " + obj.a);

        PassByReference obj1 = obj;   // both refer to same object
        obj1.updateMethod(200);

        System.out.println("After Change: " + obj.a);
    }

    void updateMethod(int b)
    {
        a = a + b;
    }
}