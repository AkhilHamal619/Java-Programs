//Life cycle of Thread.
package javaThreads;

class ThreadLifeCycleA extends Thread
{
    public void run()
    {
        System.out.println("Thread A");
        System.out.println("M is Thread A");
        for(int i = 1; i<=5; i++)
        {
             System.out.println("i="+i);
             try
             {
                Thread.sleep(1000);
             }
             catch(InterruptedException e)
             {
                e.printStackTrace();
             }
        }
         System.out.println("Thread A completed");
    }    
}

class ThreadLifeCycleB extends Thread
{
    public void run()
    {
        System.out.println("Thread B");
        System.out.println("M in Thread B");
        for(int i = 1; i<=5; i++)
        {
            System.out.println("i="+i);
        }
            System.out.println("Thread B completed");
    }
    
}

public class ThreadLifeCycle 
{
    public static void main(String[]args)
    {
        ThreadLifeCycleA t1 = new ThreadLifeCycleA();
        ThreadLifeCycleB t2 = new ThreadLifeCycleB();

        t1.start();
        t1.yield();
        try
        {
            t1.sleep(1000);
        }
        catch(InterruptedException e)
        {
            e.printStackTrace();
        }
        t2.start();
        System.out.println("Main Thread End");
    }    
}
