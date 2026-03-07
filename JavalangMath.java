import java.lang.Math;

public class JavalangMath
{
    public static void main(String[] args)
    {
        float a = 5;
        float b = 10;

        System.out.println("Maximum number of a and b is: " + Math.max(a,b));
        System.out.println("Square root of b is: " + Math.sqrt(b));
        System.out.println("Power of a and b is: " + Math.pow(a,b));

        System.out.println("Logarithm of a is: " + Math.log(a));
        System.out.println("Logarithm of b is: " + Math.log(b));

        System.out.println("Log10 of x is: " + Math.log10(a));
        System.out.println("Log10 of y is: " + Math.log10(b));

        System.out.println("Log1p of x is: " + Math.log1p(a));

        System.out.println("exp of a is: " + Math.exp(a));
        System.out.println("expm1 of a is: " + Math.expm1(a));
    }
}