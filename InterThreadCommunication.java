class WaitNotifyDemo extends Thread
{
    public void run()
    {
        synchronized(this)
        {
            for(int i=0; i<=5; i++)
            {
                System.out.println("This is Child Thread:"+i);
            }
            notify();
        }
    }
}

public class InterThreadCommunication
{
    public static void main(String[]args)
    {
        WaitNotifyDemo WaitNotifyDemo = new WaitNotifyDemo();
        WaitNotifyDemo.start();
        synchronized(WaitNotifyDemo)
        {
            System.out.println("This is Main Thread waiting for Child Thread Completion");
            try
            {
                for(int i=0; i<=5; i++)
                {
                    if(i==2)
                    {
                        WaitNotifyDemo.wait();
                    }
                        System.out.println("Main Thread:"+i);
                }
            } catch(InterruptedException e)
                {
                     System.out.println(e.getMessage());
                }
        }
    }
}
