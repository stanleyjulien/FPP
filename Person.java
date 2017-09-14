package lesson5;

public class Person implements Cloneable
{
	String name;
	Computer computer;
	
	//Constructor
	public Person(String name, Computer computer)
	{
		this.name = name;
		this.computer = computer;
	}
	
	@Override
	public String toString()
	{
		return name+", "+computer.toString();
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException 
	{

		Person clone=(Person)super.clone();
		
		clone.computer = (Computer)this.computer.clone();
	    
	    return clone;

	  }
	
	
	
	public static void main(String[] args) throws CloneNotSupportedException 
	{
		Computer c = new Computer("HP","Intel",8,3,2.5);
		Person p = new Person("Jean Adams", c);
		//p.name = "Jean Adams";
		
		System.out.println("Before Cloning");
	    System.out.println(p);
	    
	    Person clonePerson= (Person) p.clone(); 
	    System.out.println("After Cloning");
	    System.out.println(clonePerson);
	    
	    p.computer.setProcessor("AMD");
	    System.out.println("After Modifing the Processor");
	    System.out.println(clonePerson);
		
	}
}
/*Result
 * Shallow Clone
Before Cloning
Jean Adams, Manufacturer: HP, Processor: Intel, Ram size: 8 GB, Disk size: 3 T, Processor speed: 2.5 GHz
After Cloning
Jean Adams, Manufacturer: HP, Processor: Intel, Ram size: 8 GB, Disk size: 3 T, Processor speed: 2.5 GHz
After Modifing the Processor
Jean Adams, Manufacturer: HP, Processor: AMD, Ram size: 8 GB, Disk size: 3 T, Processor speed: 2.5 GHz

*Deep Clone
Before Cloning
Jean Adams, Manufacturer: HP, Processor: Intel, Ram size: 8 GB, Disk size: 3 T, Processor speed: 2.5 GHz
After Cloning
Jean Adams, Manufacturer: HP, Processor: Intel, Ram size: 8 GB, Disk size: 3 T, Processor speed: 2.5 GHz
After Modifing the Processor
Jean Adams, Manufacturer: HP, Processor: Intel, Ram size: 8 GB, Disk size: 3 T, Processor speed: 2.5 GHz
*/
