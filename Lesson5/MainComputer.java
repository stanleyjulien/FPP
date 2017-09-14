package lesson5;

public class MainComputer 
{
	public static void main(String[] args)
	{
		Computer c = new Computer("HP","Intel",8,3,2.5);
		Computer c2 = new Computer("Acer","Intel",12,2,3.2);
		Computer c3 = new Computer("HP","Intel",8,3,2.5);
		
		System.out.println(c);
		
		System.out.println(c.equals(c2));
		System.out.println(c.equals(c3));
		
		System.out.println(c.hashCode());
		System.out.println(c3.hashCode());
		
		System.out.println(c.hashCode());
		System.out.println(c2.hashCode());
	}
}

/*Result
Manufacturer: HP, Processor: Intel, Ram size: 8 GB, Disk size: 3 T, Processor speed: 2.5 GHz
false
true
-1152832755
-1152832755
-1152832755
-1009110566
*/
 