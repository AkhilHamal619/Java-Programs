package javaQueue;
import java.util.Queue;
import java.util.LinkedList;

public class QueueExample {
	public static void main(String[]args)
	{
		Queue<Integer> queue = new LinkedList<>();
		
		queue.add(10);//Enqueue
		queue.add(20);
		queue.add(30);
		
		System.out.println("First element:"+queue.peek());
		int dequeue = queue.remove(); //Dequeue
		System.out.println("dequeued:"+dequeue);
		System.out.println("After Dequeue, front:"+queue.peek());
		
		
	}
}