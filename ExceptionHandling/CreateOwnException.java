//Creating our own Exception.

package ExceptionHandling;
import java.util.Scanner;

public class CreateOwnException
{
    int balance;

    public void amountWithdraw(int a)
    {
        try
        {
            if(a > balance)
                throw new LessBalance(a, balance);

            balance = balance - a;
            System.out.println("Amount withdrawn. Your Balance is: " + balance);
        }
        catch(LessBalance e)
        {
            System.out.println("Enter Amount less than: " + balance);
        }
    }

    public static void main(String[] args)
    {
        CreateOwnException obj = new CreateOwnException();
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the Balance:");
        obj.balance = input.nextInt();

        System.out.println("Enter the Amount to withdraw:");
        int a = input.nextInt();

        obj.amountWithdraw(a);
    }
}

class LessBalance extends Exception
{
    public LessBalance(int a, int b)
    {
        System.out.println("Your balance is: " + b +
                " and the Amount you want to withdraw: " + a);
    }
}