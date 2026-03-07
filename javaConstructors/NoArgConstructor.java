//NoArgumentConstructors
package javaConstructors;

public class NoArgConstructor
{
    public NoArgConstructor()
    {
        System.out.println("Constructor of class A is called:");
    }
    public void display()
    {
        System.out.println("NoArgumentConstructor");
    }
    public static void main(String[]args)
    {
        NoArgConstructor obj = new NoArgConstructor();
        obj.display();
    }
}