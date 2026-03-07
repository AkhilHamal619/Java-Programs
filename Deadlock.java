public class Deadlock
{
    final String str1 = "Akhil";
    final String str2 = "Anjan";

    Thread thread1 = new Thread()
    {
        public void run()
        {
            synchronized(str1)
            {
                try
                {
                    System.out.println(Thread.currentThread().getName() + "Locked:" +str1);
                    Thread.sleep(5000);
                } 
                catch(InterruptedException e)
                {
                    e.printStackTrace();
                }
                synchronized(str2)
                {
                     System.out.println(Thread.currentThread().getName() + "Locked:" +str2);
                }
            }
        }
    };

    Thread thread2 = new Thread()
    {
        public void run()
        {
            synchronized(str2)
            {
                System.out.println(Thread.currentThread().getName() + "Locked:" +str2);
                synchronized(str1)
                {
                    System.out.println(Thread.currentThread().getName() + "Locked:" +str1);
                }
            }
        }
    };

    public static void main(String[]args)
    {
        Deadlock obj = new Deadlock();

        obj.thread1.start();
        obj.thread2.start();
    }
}
