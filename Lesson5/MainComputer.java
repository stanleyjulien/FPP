package lesson5;

public class MainComputer 
{
	public static void main(String[] args)
	{
		Computer c = new Computer("HP","Intel",8,3,2.5);
		
		System.out.println(c);
		
		System.out.println(c.equals(c));
	}
}
