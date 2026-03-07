public class PassByValue
{
    public static void main(String[]args)
    {
        int a = 10;
        System.out.println("Before calling the method:"+a);
        PassByValue obj = new PassByValue();
        obj.ChangeValue(a);
        System.out.println("After calling the method:"+a);
    }    

    void ChangeValue(int b)
    {
        b = 20;
        System.out.println("Inside the method:"+b);
    }
}
