package javaStrings;

public class StringDemo
{
    public static void main(String[] args)
    {
        String r = "Hello World";
        String p = "Java Programming";

        System.out.println("String length = " + r.length() + " String length = " + p.length());

        System.out.println("Concatenation = " + r.concat(p));

        System.out.println("Lower case = " + r.toLowerCase());

        System.out.println("Upper case = " + p.toUpperCase());

        System.out.println("Sub string = " + p.substring(2,6));

        System.out.println("String replace = " + p.replace('a','e'));

        System.out.println("Remove extra space = " + p.trim());

        System.out.println("Compare = " + r.compareTo(p));

        System.out.println("Character = " + r.charAt(4));

        String str = "hello hi! hehe! World";

        String[] str2 = str.split("t");

        for(int i = 0; i < str2.length; i++)
        {
            System.out.println(str2[i]);
        }

        System.out.println("Index of e = " + str.indexOf('e'));
    }
}