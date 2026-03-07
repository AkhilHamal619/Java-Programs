public class PassByReference 
{
    int a = 10;
    void UpdateMethod(int b)
    {
        a = a + b;
    }    

    public static void main(String[]args)
    {
        PassByReference obj = new PassByReference();
        System.out.println("Before Change:"+obj.a);
        
        PassByReference obj1;
        obj1 = obj;
        obj1.UpdateMethod(200);
        System.out.println("After Change:"+obj.a);
    }
}
