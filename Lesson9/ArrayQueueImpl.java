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
		if(size == 0)
		{
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
		}
		if(isEmpty()) // My first adding element
		{
			//arr[++front] = obj;
			++front;
		}
		arr[rear] = obj;
		++rear;
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
		
		//int[] temp = new int[arr.length]; 

		int val = arr[front];
		
		//System.arraycopy(arr, front+1, temp, 0, temp.length-1);
		//arr = temp;
		++front;
		--size;
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
