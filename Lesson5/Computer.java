package lesson5;

public class Computer 
{
	private String manufacturer;
	private String processor;
	private int ramSize;
	private int diskSize;
	private double processorSpeed;
	
	// Constructor
	public Computer(String manufacturer, String processor, int ramSize, int diskSize, double processorSpeed)
	{
		this.manufacturer	= manufacturer;
		this.processor		= processor;
		this.ramSize		= ramSize;
		this.diskSize		= diskSize;
		this.processorSpeed	= processorSpeed;
	}
	
	// Getter
	public String getManufacturer()
	{
		return manufacturer;
	}
	public int getRamSize()
	{
		return ramSize;
	}
	public int getDiskSize()
	{
		return diskSize;
	}
	public double getProcessorSpeed()
	{
		return processorSpeed;
	}
	public double computePower()
	{
		return ramSize * processorSpeed;
	}
	
	@Override
	public String toString()
	{
		
		return "Manufacturer: "+manufacturer+", Processor: "+processor
				+", Ram size: "+ramSize+" GB, Disk size: "+diskSize
				+" T, Processor speed: "+processorSpeed+" GHz";
	}
	
	@Override
	public boolean equals(Object ob)
	{
		if(ob == null)
		{
			return false;
		}
		else if(!(ob instanceof Computer))
		{
			return false;
		}
		else
		{
			Computer c = (Computer) ob;
			if(manufacturer.equals(c.manufacturer) && processor.equals(c.processor) && ramSize == c.ramSize 
					&& diskSize == c.diskSize && processorSpeed == c.processorSpeed)
			{
				return true;
			}
			/*else if(processor.equals(c.processor))
			{
				return true;
			}*/
			else
			{
				return false;
			}
			 
		}
	}
	
	@Override 
	public int hashCode()
	{
		return 0;
	}
	
	
}