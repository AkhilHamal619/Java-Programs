package finalKeyword;

class Company
{
    final void comment()
    {
        System.out.println("Only company admin can access");
    }
}

public class finalMethod extends Company
{
    void comment() //trying to override (Error)
    {
        System.out.println("Intern trying to access admin");
    }
    public static void main(String[]args)
    {
        finalMethod obj = new finalMethod();
        obj.comment();
    }    
}
