package lesson4;

public class RecursiveMergeString 
{
	public static String mString(String a, String b) 
	{
		if(a.isEmpty() && !b.isEmpty())
		{
			return b; // Base case
		}
		else if(!a.isEmpty() && b.isEmpty())
		{
			return a; // Base case
		}
		else if(a.charAt(0) > b.charAt(0) ) 
		{
			return b.charAt(0) + mString(a,b.substring(1));
		}
		else
		{
			return a.charAt(0) + mString(a.substring(1),b);
		}
	}
	
	
	public static void main(String[] args) 
	{
		System.out.println(mString("ace","bdf"));
	}
}

/**
 abcdef
 */
 