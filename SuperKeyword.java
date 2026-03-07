class SuperKeyword1
{
    int a = 5;
}

class SuperKeyword2 extends SuperKeyword1
{
    int a = 10;
    void display()
    {
        System.out.println(a);
        System.out.println(super.a);   
    }
}

public class SuperKeyword 
{
    public static void main(String[]args)
    {
        SuperKeyword2 obj = new SuperKeyword2();
        obj.display();
    }
}
