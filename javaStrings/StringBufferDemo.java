package javaStrings;

public class StringBufferDemo
{
    public static void main(String[] args)
    {
        StringBuffer sb1 = new StringBuffer();

        System.out.println("Length of StringBuffer is: " + sb1.length());
        System.out.println("By default capacity of the StringBuffer is: " + sb1.capacity());

        StringBuffer sb = new StringBuffer("Hello Java");

        System.out.println("Length of StringBuffer is: " + sb.length());
        System.out.println("Capacity of the StringBuffer is: " + sb.capacity());

        System.out.println("Original Text: " + sb);

        sb.append(" Programming");
        System.out.println("After Append: " + sb);

        sb.insert(4, " Programming");
        System.out.println("After Insert: " + sb);

        sb.replace(0,5,"Hi");
        System.out.println("Replaced Text: " + sb);

        sb.reverse();
        System.out.println("Reversed String Buffer content: " + sb);
    }
}