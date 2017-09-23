package lesson10;
import java.util.Iterator;
import java.util.TreeMap;
import java.util.TreeSet;
// Demo code for the user implementation of Binary search tree
public class MyBST {
	/** The tree root. */
	private BinaryNode root;
	int size = 0;

	public MyBST() {
		root = null;
	}
	
	/**
	* Prints the values in the nodes of the tree
	* in sorted order. Inorder Traversal
	*/
	
	public void preOrder()
	{
		if(root == null)
		{
			System.out.println("Empty tree");
			return;
		}
		System.out.println(root.element);
		BinaryNode leftChild = root.left; //new BinaryNode(null);
		BinaryNode rightChild ;
		while(leftChild != null)
		{
			System.out.println(leftChild.element);
			leftChild = leftChild.left;
		}
		if(leftChild.right != null)
		{
			rightChild = leftChild.right;
			System.out.println(rightChild.element);
		}
	}
	
	public void printTree() {
		if( root == null )
			System.out.println( "Empty tree" );
		else
			printTree(root);
	}
	// Inorder Traversal to print the nodes in Ascending order
	private void printTree( BinaryNode t ){
		if( t != null ){
			printTree( t.left );				//L (Left)
		    System.out.print(t.element+",");	//V (Visited)
		    printTree( t.right );				//R (Right)
		} 
	}
	
	
	public void printTreePre() {
		if( root == null )
			System.out.println( "Empty tree" );
		else
			printTreePre(root);
	}
	// Pre-order Traversal to print the nodes in Pre order order
	private void printTreePre( BinaryNode t ){
		if( t != null ){
		    System.out.print(t.element+",");	//V (Visited)
		    printTreePre( t.left );				//L (Left)
		    printTreePre( t.right );			//R (Right)
		} 
	}
	
	public void printTreePost() {
		if( root == null )
			System.out.println( "Empty tree" );
		else
			printTreePost(root);
	}
	// Pre-order Traversal to print the nodes in Pre order order
	private void printTreePost( BinaryNode t ){
		if( t != null ){
		    printTreePost( t.left );			//L (Left)
		    printTreePost( t.right );			//R (Right)
		    System.out.print(t.element+",");	//V (Visited)
		} 
	}
	
	private boolean find( BinaryNode t, int val ){
		boolean f = false;
		if( t != null ){
			if(t.element == val) // Base case
		    {
			    	f = true;
			    	return f;
		    }
			f = find( t.left, val );	
			if(!f ) 
			{
				f = find( t.right, val );
			}
						
		    //System.out.print(t.element+",");	
		    
		} 
		return f; // Base case
	}
	
	public boolean contains(Integer key)
	{ //implement 
		//boolean f = false;
		//BinaryNode t = root;
		
		return find(root, key);
	}
	
	public Integer getRoot()
	{//implement 
		if(root == null) 
		{
			return null;
		}
		
		return root.element;
	}
	
	public Integer leafNodes()
	{
		return leafNodes(root);
	}
	 
	private int leafNodes(BinaryNode t) 
	{// Implement
	    int count = 0;
	    if(t != null)
	    {
		    	if((t.left == null) && (t.right == null))
		    	{ 
		    		count ++;
		    	}
		    	else
		    	{
		    		count += leafNodes(t.left) + leafNodes(t.right);
		    	} 
	    	}
	    return count;
	 }
	
	public int size()
	{
		return size;
		//implement 
	}
	
	public boolean isEmpty()
	{//implement 
		return size == 0; 
	}
	
	
	public Integer findMax() 
	{
	      return findMax(root);
	}
	
	public Integer findMax(BinaryNode max) 
	{
	   if (max == null) {
	    	   return null;
	       }
	   while (max.right != null) 
	   {
	       max = max.right;
	   }
	   return max.element;
	}
	
	
	public Integer findMin() 
	{
	     return findMin(root);
	}
	
	private Integer findMin(BinaryNode min) 
	{ 
		if (min == null) 
		{
			return null;
		}
	
		while (min.left != null) 
		{
			min = min.left;
		}
		return min.element;
	}
	
	//Assume the data in the Node is an Integer.	

	public void insert(Integer x) {
		if (root == null) {
			root = new BinaryNode(x);
			size++;
			return;
		}
		else { 
			BinaryNode n = root;
			boolean inserted = false;

			while(!inserted)//true
				{
				if(x.compareTo(n.element)<0) {
					//space found on the left
					if(n.left == null){
						n.left = new BinaryNode(x,null,null);
						inserted = true;
					}
					//keep looking for a place to insert (a null)
					else {
						n = n.left;
					}
				}				
				else if(x.compareTo(n.element)>0){ 
					//space found on the right					
					if(n.right==null)
					{
						n.right = new BinaryNode(x,null,null);
						inserted = true;
					}
						//keep looking for a place to insert (a null)
					else 
					{
						n = n.right;
					}
										
				}
				// if a node already exists
				else 
				{
					inserted = true;
				}

			}

		}
		
		size++;
	}
	private class BinaryNode {

		private Integer element;// The data in the node
		private BinaryNode left;      // Left child
		private BinaryNode right;     // Right child	  
		// Constructors 
		
		BinaryNode( Integer theElement ){
			this( theElement, null, null );
		}	

		BinaryNode( Integer element, BinaryNode left, BinaryNode right ){
			this.element = element;
			this.left = left;
			this.right = right;
		}
		
	}
		

	public static void main(String[] args) {
		
		MyBST mybst = new MyBST();
		
		//int [] a = {15, 12, 9, 56, 1, 16, 19, 22, 3, 100, 2, 25};
		//int [] a = {43,15,60,8,30,50,82,20,35,70};
		int[] a = {45,25,65,75,15,30,55,80,10,20,50,60};
	
		for (int j = 0; j < a.length; j++ ) {
			mybst.insert(a[j]);
					
		}
		//mybst.insert(12);
		mybst.printTree();
		System.out.println();
		mybst.printTreePre();
		System.out.println();
		mybst.printTreePost();
		System.out.println();
		System.out.println(mybst.contains(49));
		System.out.println(mybst.getRoot());
		System.out.println(mybst.leafNodes());
		System.out.println(mybst.size());
		System.out.println(mybst.isEmpty());
		System.out.println(mybst.findMax());
		System.out.println(mybst.findMin());
		
		
		/*TreeSet<Integer> ts = new TreeSet<Integer>();
		
		for (int j = 0; j < a.length; j++ ) {
			ts.add(a[j]);
			System.out.println("\nAfter inserting " + j + "th item " + a[j]);
			Iterator<Integer> it = ts.iterator();		
			Integer nextItem = null;
			while(it.hasNext()) {
				nextItem = it.next();
				System.out.print(nextItem + " ");
			} 
			System.out.println();
		}
		
		TreeMap<Integer, String> map = new TreeMap<Integer, String>();
		map.put(8, "Hello");
		map.put(10, "World!");
		map.put(11, "Welcome");
		map.remove(8);
		String str = map.get(11)+", "+ map.get(10);
		System.out.println(str);
		*/
			
	}
}
/*Result
10,15,20,25,30,45,50,55,60,65,75,80,
45,25,15,10,20,30,65,55,50,60,75,80,
10,20,15,30,25,50,60,55,80,75,65,45,
false
45
6
12
false
80
10
 */
 