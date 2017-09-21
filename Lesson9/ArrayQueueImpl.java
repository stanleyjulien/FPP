package lesson9;

public class ArrayQueueImpl 
{
	private int[] arr = new int[10];
	private int front = -1;
	private int rear = 0;
	private int size = 0;
	
	public int peek() 
	{
		//implement
		if(isEmpty())
		{
			System.out.println("Queue is Empty");
			return -1;
		}
		return arr[front];
	}
	
	public void enqueue(int obj)
	{
		//implement
		if(arr.length == size)
		{
			// resizing
			resize();
		}
		if(isEmpty()) // My first adding element
		{
			++front;
		}
		arr[rear] = obj;
		rear++;
		size++;
	}
	public int dequeue() 
	{
		//implement
		if (isEmpty()) 
		{
			System.out.println("Queue is Empty");
			return -1;
		}

		int val = arr[front];
		
		front++;
		size--;
		return val;
		
	}
	public boolean isEmpty()
	{
		//implement
		return (size == 0);
	}
	
	public int size()
	{
		//implement
		return size;
	}
	private void resize()
	{
		//implement
		int l2 = 2 * arr.length;
		int[] temp = new int[l2];
		System.arraycopy(arr, 0, temp, 0, l2);
		arr = temp;
	}
	
	public void print()
	{
		for(int i = front; i < rear; ++i)
		{
			System.out.print(arr[i]);
		}
		System.out.println();
	}
}
