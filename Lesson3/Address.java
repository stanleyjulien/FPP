package lesson3;

public class Address 
{
	private String street;
	private String city;
	private String state;
	private String zip;
	
	public Address(String street, String city, String state, String zip)
	{
		this.street	= street;
		this.city	= city;
		this.state	= state;
		this.zip		= zip;
	}
	
	//Begin getter
	public String getStreet()
	{
		return street;
	}
	
	public String getCity()
	{
		return city;
	}
	
	public String getState()
	{
		return state;
	}
	
	public String getZip()
	{
		return zip;
	}
	
	//End of getter
	
	//Begin setter
	public void setStreet(String street)
	{
		this.street	= street;
	} 
	
	public void setCity(String city)
	{
		this.city	= city;
	}
	
	public void setState(String state)
	{ 
		this.state	= state;
	}
	
	public void zip(String zip)
	{
		this.zip	= zip;
	}
	//End of setter
	
}