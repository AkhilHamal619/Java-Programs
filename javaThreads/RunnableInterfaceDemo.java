package javaThreads;

class RunnableInterfaceExample implements Runnable
{
    @Override
    public void run()
    {
        for(int i=0; i<5; i++)
        {
            System.out.println("Runnable thread running:"+i);
        }
    }
}
public class RunnableInterfaceDemo 
{
    public static void main(String[]args)
    {
        RunnableInterfaceExample r = new RunnableInterfaceExample();
        Thread t1 = new Thread(r);
        t1.start();
    }    
}
