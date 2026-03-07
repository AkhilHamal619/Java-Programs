package javaInheritance;

class SuperClass
{
    void show()
    {
        System.out.println("This is the SuperClass");
    }
}

class SubclassI extends SuperClass
{
    void show()
    {
        System.out.println("My name is Akhil");
    }
}    

class SubclassII extends SuperClass
{
    void show()
    {
        System.out.println("My name is Rahul");
    }
}    

class SubclassIII extends SuperClass
{
    void show()
    {
        System.out.println("My name is Shyam");
    }
}    

public class HierarchicalInheritance 
{
    public static void main(String[] args)
    {
        SubclassI obj1 = new SubclassI();
        SubclassII obj2 = new SubclassII();
        SubclassIII obj3 = new SubclassIII();

        obj1.show();
        obj2.show();
        obj3.show();
    }
}