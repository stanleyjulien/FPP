package lesson5;

public abstract class Employee implements Payable
{
	private String firstName;
	private String lastName;
	private String socialSecurityNumber;
	
	// Constructor
	public Employee(String firstName, String lastName, String socialSecurityNumber)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.socialSecurityNumber = socialSecurityNumber;
	}
	// End constructor
	
	// Getter
	public String getFirstName()
	{
		return firstName;
	}
	public String getLastName()
	{
		return lastName;
	}
	public String getSocialSecurityNumber()
	{
		return socialSecurityNumber;
	}
	// End getter
}
