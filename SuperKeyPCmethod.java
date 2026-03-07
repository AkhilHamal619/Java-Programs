//Superkeyword to refer parent class method

class SuperKeywordMethod1
{
    void display()
    {
        int a = 5, b =10;
        int sum = a + b;
        System.out.println("The sum is:"+sum);
    }
}

class SuperKeywordMethod2 extends SuperKeywordMethod1
{
    int a = 10;
    void sum()
    {
        System.out.println(a);
        super.display();
    }
}

public class SuperKeyPCmethod
{
    public static void main(String[]args)
    {
        SuperKeywordMethod2 obj = new SuperKeywordMethod2();
        obj.sum();
    }    
}
