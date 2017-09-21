package lesson8;

public class MyStringLinkedList {
	Node header;
	int size = 0;

	MyStringLinkedList() {
		header = null;
	}

	public void addFront(String item) {
		if (header == null)
			header = new Node(null, item, null);
		else {
			Node n = new Node(null, item, header);
		    	header.previous = n;
		    	header = n;
		}
		size++;
	}

	public String getFirst()
	{
		if(header == null) 
			return null;
		else
			return header.value;
	}
	
	public String getLast()
	{
		if(header == null) 
			return null;
		else
		{
			// Find last node by traversing the list
			Node n = header;
			while(n.next != null)
			{
				n = n.next;
			}
			return n.value;
		}
	}
	
	public void removeFirst()
	{
		if(header == null) 
		{
			return ;
		}
		else
		{
			/*System.out.println(header.value);
			System.out.println(header.next.value);
			System.out.println(header.next.previous.value);
			*/
			header.next.previous = header;
			header = header.next;
		}
	}
	
	public void removeLast()
	{
		if(header == null) 
		{
			return ;
		}
		else
		{
			Node n = header;
			while(n.next != null)
			{
				n = n.next;
				//System.out.print(n.value);
			}
			
			n.previous.next = null;
			//System.out.println(n.value);
			n.previous = null;
		}
	}
	
	public void printMin()
	{
		if(header == null) return ;
		
		Node n = header;
		String val = n.value;
		while(n.next != null)
		{
			if(val.compareTo(n.value) > 0)
			{
				val = n.value;
			}
			
			n = n.next;
		}
		System.out.println(val);
	}
	
	public void printMax()
	{
		if(header == null) return ;
		
		Node n = header;
		String val = n.value;
		do
		{
			if(n.value.compareTo(val) > 0)
			{
				val = n.value;
			}
			
			n = n.next;
		}while(n != null);
		System.out.println(val);
	}
	
	public void print(Node n)
	{
		/*if(n == null) 
			return ;
		else
		{
			print(n.next);
			System.out.println(n.value);
		}*/
		if(n != null) 
		{
			System.out.println(n.value); 
			print(n.next);
		}
		else
		{
			return ;
		}
		
	}
	
// Implement the code

	public void addLast(String item) 
	{
		Node node = new Node(null, item, null);
		Node n = header;
		if(header == null)
			header = node;
		else
		{
			// Find the last node
			while(n.next != null)
			{
				n = n.next;
			}
			// End finding
			node.previous = n;
			n.next = node;
		}
		size++;
	}


	// implement the code
	public void postAddNode(Node n, String value)
	{
		if(n == null) return ;
		
		Node node = new Node(null, value, null);
		Node fNode = findItem(n.value);
		
		if(fNode == null)  System.out.println("Node not found");
		if(fNode.next == null) // The node that we search is the last node
		{	//addLast(value);
			node.previous = fNode;
			fNode.next = node;
		}
		else
		{
			
			node.next = fNode.next;
			node.previous = fNode;
			fNode.next.previous = node;
			fNode.next = node;
		}
		size++;			
	}
// implement the code

       public int Size()
       {
    	   		return size;
       }

// implement code
    public boolean isEmpty()
    {
    		return size == 0;
    }  

 

       
	
	public void preAddNode(Node n, String value){
		Node newNode;
		if (n == null){
			//List is empty
			newNode = new Node(null, value, null);
		}
		else if (n.previous == null) {
			//n is the first node
			addFront(value);
		}
		else {
			newNode = new Node(n.previous, value, n);
			n.previous.next = newNode;
			n.previous = newNode;
		}	
					
	}
	
	public Node findLast() {
		if (header == null)
			return null;
		else {
			Node temp = header;
			while (temp.next != null)
				temp = temp.next;
			return temp;
		}
	}

	public Node findItem(String str) {
		if (header == null)
			return null;
		else {
			Node temp = header;
			while (temp != null)
				if (str.equals(temp.value))
					return temp;
				else
					temp = temp.next;
			return null;
		}
	}

	public void deleteNode(Node n) {
		if (header != null && n != null) {
			if (n.next == null && n.previous == null) {
				// only one node
				header = null;
				n = null;
				System.out.println("I am here 1");

			} else if (n.previous == null) {
				// remove first node
				n.next.previous = null;
				header = n.next;
				n = null;
				System.out.println("I am here 2");
			} else if (n.next == null) {
				// remove last node
				n.previous.next = null;
				n = null;
				System.out.println("I am here 3");
			} else {
				// general case
				n.next.previous = n.previous;
				n.previous.next = n.next;
				n = null;
				System.out.println("I am here 4");
			}

		}

	}
	
	public void deleteList(){
		Node tempOne = header;
		Node tempTwo = header;
		while (tempOne != null) {
			tempOne = tempOne.next;
			tempTwo = null;
			tempTwo = tempOne;
		}
		header = null;
	}

	public String toString() {
		String str =""; 
		Node temp = header;
		while (temp != null) {
			str = str + "-->[" + temp.value.toString() + "]";
			temp = temp.next;
		}
		str = str + "-->[" + "NULL" + "]";
		return str;
	}

	public void printReverse() {
		String str =""; 
		Node temp = findLast();
		while (temp != null) {
			str = str + "==>[" + temp.value.toString() + "]";
			temp = temp.previous;
		}
		str = str + "==>[" + "NULL" + "]";
		System.out.println(str);
	}
	
	public class Node 
	{
		String value;
		Node next;
		Node previous;

		Node(Node previous, String value, Node next) 
		{
			this.previous = previous;
			this.value = value;
			this.next = next;
		}

		public String toString() {
			return value;
		}
	}

	public static void main(String[] args) 
	{
		MyStringLinkedList mySL = new MyStringLinkedList();
		System.out.println(mySL);
		mySL.printReverse();
		mySL.addFront("Carrot Cake");
		System.out.println(mySL);
		mySL.printReverse();
		mySL.addFront("Blueberry Muffin");
		System.out.println(mySL);
		mySL.printReverse();
		mySL.addFront("Apple Pie");
		System.out.println(mySL);
		mySL.printReverse();
		mySL.addLast("Orange Juice");
		System.out.println(mySL);
		mySL.printReverse();
		mySL.addLast("Peach Sauce");
		System.out.println(mySL);
		mySL.printReverse();
		mySL.deleteNode(mySL.findItem("Apple Pie"));
		System.out.println(mySL);
		mySL.printReverse();
		mySL.deleteNode(mySL.findItem("Peach Sauce"));
		System.out.println(mySL);
		mySL.printReverse();
		mySL.deleteNode(mySL.findItem("Carrot Cake"));
		System.out.println(mySL);
		mySL.printReverse();
		mySL.postAddNode(mySL.findItem("Blueberry Muffin"), "Carrot Cake");
		System.out.println("Post add Node 1"+mySL);
		mySL.printReverse();
		mySL.preAddNode(mySL.findItem("Blueberry Muffin"), "Apple Pie" );
		System.out.println(mySL);
		mySL.printReverse();
		mySL.postAddNode(mySL.findItem("Carrot Cake"), "Danish Delight" );
		System.out.println("Post add Node 2"+mySL);
		mySL.printReverse();
		mySL.preAddNode(mySL.findItem("Orange Juice"), "Mango Smoothie" );
		System.out.println(mySL);
		mySL.printReverse();
		mySL.postAddNode(mySL.findItem("Orange Juice"), "Peach Sauce" );
		System.out.println("Post add Node 3"+mySL);
		//mySL.printReverse();
		System.out.println(mySL.getFirst());
		System.out.println(mySL.getLast());
		mySL.removeFirst();
		System.out.println(mySL);
		mySL.removeLast();
		System.out.println("Remove last "+mySL);
		mySL.printMin();
		mySL.printMax();
		System.out.println("Printing recursively");
		mySL.print(mySL.header);
		mySL.deleteList();
		System.out.println(mySL);
		mySL.printReverse();
		
	}

}
