package javaSynchronization;

class SynchronizaionBlock1
{
    public void display(String name)
    {
        synchronized(this)
        {
            for(int i=0; i<3; i++)
            {
                System.out.println("Hello:"+name);
            }
        }
    }
}

class SynchronizaionBlock2 extends Thread
{
    SynchronizaionBlock1 block1;
    String name;
    SynchronizaionBlock2(SynchronizaionBlock1 block1, String name)
    {
        this.block1 = block1;
        this.name = name;
    } 
    public void run()
    {
        block1.display(name);
    }
}

public class SynchronizaionBlock
{
    public static void main(String[]args)
    {
        SynchronizaionBlock1 block1 = new SynchronizaionBlock1();
        SynchronizaionBlock2 t1 = new SynchronizaionBlock2(block1, "Akhil");
        SynchronizaionBlock2 t2 = new SynchronizaionBlock2(block1, "Anjan");
        t1.start();
        t2.start();
    }
}
