package javaThreads;
class ThreadPriorityDemo extends Thread
{
    public void run()
    {
        System.out.println("Running thread: " + Thread.currentThread().getName());
        System.out.println("Priority: " + Thread.currentThread().getPriority());
    }
}

class ThreadPriorityExample
{
    public static void main(String[] args)
    {
        System.out.println("Main thread priority: " + Thread.currentThread().getPriority());

        ThreadPriorityDemo t1 = new ThreadPriorityDemo();
        ThreadPriorityDemo t2 = new ThreadPriorityDemo();
        ThreadPriorityDemo t3 = new ThreadPriorityDemo();

        // Setting priorities
        t1.setPriority(6);
        t2.setPriority(3);
        t3.setPriority(9);

        System.out.println("Priority of thread t1: " + t1.getPriority());
        System.out.println("Priority of thread t2: " + t2.getPriority());
        System.out.println("Priority of thread t3: " + t3.getPriority());

        // Starting threads
        t1.start();
        t2.start();
        t3.start();
    }
}

//MIN_PRIORITY=1
//NORM_PRIORITY=5
//MAX_PRIORITY=10