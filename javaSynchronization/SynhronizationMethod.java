package javaSynchronization;

class OurTransaction
{
    double balance = 600;
    public double getBalance()
    {
        return balance;
    }

    public void withdraw(double amt)
    {
        balance = balance-amt;
    }
}

public class SynhronizationMethod implements Runnable
{
    OurTransaction obj = new OurTransaction();

    public static void main(String[]args)
    {
        SynhronizationMethod acc = new SynhronizationMethod();
        Thread t1 = new Thread(acc);
        Thread t2 = new Thread(acc);

        t1.setName("Akhil");
        t2.setName("Gaurab");

        t1.start();
        t2.start();
    }

    @Override
    public void run()
    {
           {
            withdrawAmt(200);
            if(obj.getBalance() < 200)
                System.out.println("Not Enough Funds");
        }
    }

    private synchronized void  withdrawAmt(double amt)
    {
        if(obj.getBalance() >= amt)
        {
            System.out.println(Thread.currentThread().getName()+ "is going to withdraw");
            try
            {
                Thread.sleep(1000);
            }
            catch(Exception e)
            {
                 System.out.println(e.getMessage());
            }
            obj.withdraw(amt);
            System.out.println(Thread.currentThread().getName()+ "Completes the withdraw");
        }
        else
             System.out.println("Not enough funds for" +Thread.currentThread().getName());
            
    }
}
