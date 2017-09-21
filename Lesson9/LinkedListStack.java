package lesson9;

interface Stack2
{
	public void push(Object o);
	
	public Object pop();
	
	public Object peek();
	
	public int size();
	
	public boolean isEmpty();
}

class SinglyLinkedListStack implements Stack2
{
	class Node
	{
		Object value;
		Node next;
		//Node previous;
		public Node(Object val)
		{
			this.value = val;
		}
	}
	
	Node top = null;
	int size = 0;

	@Override
	public void push(Object o) 
	{
		if(top == null) 
		{
			top = new Node(o);
		}
		else
		{
			Node node = new Node(o);
			node.next = top;
			top = node;
		}
		size++;
		
	}

	@Override
	public Object pop() {
		Object val;
		if(top == null) return null;
		val = top.value;
		top = top.next;
		return val;
	}

	@Override
	public Object peek() {
		if(top == null) 
		{
			System.out.println("Stack is empty");
			return null;
		}
		return top.value;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return size;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return size == 0;
	}
}

public class LinkedListStack 
{

	public static void main(String[] args) 
	{
		SinglyLinkedListStack sLLS = new SinglyLinkedListStack();
		
		sLLS.push('A');
		sLLS.push('B');
		sLLS.push('C');
		System.out.println("Peek value: "+sLLS.peek());
		//System.out.println(sLLS.top.next.next.value);
		System.out.println(sLLS.top.value);
		System.out.println(sLLS.pop());
		System.out.println(sLLS.top.value);
		

	}

}
