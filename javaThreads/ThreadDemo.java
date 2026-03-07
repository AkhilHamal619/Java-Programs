package javaThreads;

class ThreadExample extends Thread
{
    public void run()
    {
        System.out.println("Thread:"+Thread.currentThread().getName());
        for(int i=0; i<5; i++)
        {
             System.out.println("Anjan");
        }         
    }
}

public class ThreadDemo
{
    public static void main(String[]args)
    {
        System.out.println("Thread:"+Thread.currentThread().getName());
        ThreadExample obj = new ThreadExample();
        obj.start();
         for(int i=0; i<5; i++)
        {
             System.out.println("Akhil"+i);
        }    
    }
}