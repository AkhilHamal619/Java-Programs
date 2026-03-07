//Superkeyword to call Parent Class Constructor

class SuperClassKeyword1
{
    public SuperClassKeyword1()
    {
        System.out.println("This is Parent Class");
    }
}

class SuperClassKeyword2 extends SuperClassKeyword1
{
    public SuperClassKeyword2()
    {
        super(); //it calls the Parent Class by default
        System.out.println("This is Child Class");
    }
}

public class SuperKeyPCConstructor
{
    public static void main(String[]args)
    {
        SuperClassKeyword2 obj = new SuperClassKeyword2();
        //no need to call the construction
    }    
}
