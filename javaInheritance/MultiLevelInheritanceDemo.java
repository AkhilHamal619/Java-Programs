package javaInheritance;

class Grandparent
{
    void showGrandparent()
    {
        System.out.println("This is the Grandparent class");
    }
}

class Parent extends Grandparent
{
    void showParent()
    {
        System.out.println("This is the Parent class");
    }
}

class Child extends Parent
{
    void showChild()
    {
        System.out.println("This is the Child class");
    }
}

public class MultiLevelInheritanceDemo
{
    public static void main(String[] args)
    {
        Child c = new Child();
        
        c.showGrandparent();  // inherited from Grandparent
        c.showParent();       // inherited from Parent
        c.showChild();        // own method
    }
}