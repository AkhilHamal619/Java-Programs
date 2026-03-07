package finalKeyword;

final class Admin
{
    void display()
    {
        System.out.println("Java");
    }
}
public class finalClass extends Admin //error: cannot inherit from final Admin
{
    public static void main(String[]args)
    {
        finalClass obj = new finalClass();
        obj.display();
    }
}
