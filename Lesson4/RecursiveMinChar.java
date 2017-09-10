package lesson4;

public class RecursiveMinChar 
{
	
	public static char minChar(String s)
	{
		if(s.length() > 1)
		{
			char b = minChar(s.substring(1));
			if(s.charAt(0) > b) 
			{
				return b;
			}
			else
			{
				return s.charAt(0);
			}
		}
		else
		{
			return s.charAt(0); // Base case
		}
	}
	
	public static void main(String[] args)
	{
		System.out.println(minChar("akel"));
	}
}
/*
 a
 */
 