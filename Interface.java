interface EvenOdd
{
    void Odd();
}

interface SumofNatural
{
    void Sum();
}

public class Interface implements EvenOdd,SumofNatural
{
       public void Sum()
       {
            int n = 10;
            int sum = 0;
            for(int i=1; i<=n; i++)
            {
                sum = sum + i;
            }
            System.out.println(sum);
       }
      
       public void Odd()
       {
        int n = 10;
        if(n%2==0)
        {
             System.out.println("even");
        } else {
                System.out.println("odd");
            }
       }

       public static void main(String[]args)
       {
            Interface obj = new Interface();
            obj.Sum();
            obj.Odd();
       }
}
