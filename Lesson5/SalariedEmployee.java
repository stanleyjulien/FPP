package lesson5;

public class SalariedEmployee extends Employee
{
	private double weeklySalary;
	
	// Constructor
	public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber, double weeklySalary)
	{
		super(firstName, lastName, socialSecurityNumber);
		this.weeklySalary = weeklySalary;
	}
	// End constructor
	
	@Override
	public double getPaymentAmount()
	{
		return weeklySalary;
	}
	
	@Override
	public String toString()
	{
		return super.getFirstName()+", "+super.getLastName()+", "+super.getLastName()+", "+super.getSocialSecurityNumber()
		+", "+weeklySalary;
	}
}
