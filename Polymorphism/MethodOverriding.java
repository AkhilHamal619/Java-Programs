package Polymorphism;

class ParentClass
{
    void ShowData()
    {
        System.out.println("Inside ParentClass method");
    }
}

class ChildClass extends ParentClass
{
    void ShowData()
    {
        //superShowData()
        System.out.println("Inside ChildClass method");
    }
    
}
public class MethodOverriding
{
    public static void main(String[]args)
    {
        ParentClass obj = new ChildClass();
        obj.ShowData();
    }    
}
