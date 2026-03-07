public class Wrappers
{
    public static void main(String[] args)
    {
        String str = "55";

        int i = Integer.parseInt(str);
        System.out.println(i);

        double d = Double.parseDouble(str);
        System.out.println(d);

        boolean b = Boolean.parseBoolean(str);
        System.out.println(b);
    }
}