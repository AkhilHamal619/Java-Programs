package javaInheritance;

class C
{
    void show()
    {
        System.out.println("A Class");
    }
}
 
class D extends C
{
    void display()
    {
        System.out.println("B Class");
    }
}

public class SingleInheritance
{
    public static void main(String[]args)
    {
        D obj = new D();
        obj.show();
        obj.display();
    }
}