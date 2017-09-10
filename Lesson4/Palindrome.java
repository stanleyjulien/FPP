package lesson4;

public class Palindrome 
{
	public static String reversingString(String a)
	{
		if(a.length() > 1)
		{
			return reversingString(a.substring(1)) + a.charAt(0);
		}
		else
		{
			return ""+a.charAt(0);
		}
	}
	
	public static boolean isPalindrome(String a) 
	{
		String b = reversingString(a);
		if(b.equals(a))
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
	
	public static void main(String[] args)
	{
		System.out.println(isPalindrome("mum"));
	}
}

/*
true
*/