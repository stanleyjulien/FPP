package lesson5;

public class HourlyEmployee extends Employee
{
	private double wage;
	private double hours;
	
	// Constructor
	public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double wage, double hours)
	{
		super(firstName, lastName, socialSecurityNumber);
		this.wage = wage;
		this.hours = hours;
	}
	// End constructor
	
	@Override
	public double getPaymentAmount()
	{
		return wage * hours;
	}
	
	@Override
	public String toString()
	{
		return super.getFirstName()+", "+super.getLastName()+", "+super.getLastName()+", "+super.getSocialSecurityNumber()
		+", "+wage+" "+hours;
	}
}
