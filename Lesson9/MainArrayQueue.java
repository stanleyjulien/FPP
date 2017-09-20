package lesson9;

public class MainArrayQueue 
{
	public static void main(String[] args)
	{
		ArrayQueueImpl q = new ArrayQueueImpl();
		
		q.enqueue(5);
		q.enqueue(4);
		q.enqueue(3);
		q.enqueue(2);
		q.enqueue(1);
		q.print();
		System.out.println(q.dequeue());
		q.print();
		q.dequeue();
		q.print();
		//System.out.println(q.peek());
	}
}
