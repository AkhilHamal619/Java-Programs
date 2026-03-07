abstract class AbstractDemo
{
    abstract void display();
    abstract void sum(int a, int b);
}
public class AbstractMethod extends AbstractDemo
{
    void display()
    {
        System.out.println("Example of Abstract keyword");
    }
    void sum(int x, int y)
    {
        int z = x + y;
        System.out.println(z);
    }
    public static void main(String[]args)
    {
        AbstractMethod obj = new AbstractMethod();
        obj.display();
        obj.sum(10,20);
    }    
}
