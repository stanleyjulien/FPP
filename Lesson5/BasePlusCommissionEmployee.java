package lesson5;

public class BasePlusCommissionEmployee extends CommissionEmployee
{
	private double baseSalary;
	
	// Constructor
	public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber,double grossSales
			, double commissionRate, double baseSalary)
	{
		super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);
		this.baseSalary = baseSalary;
	}
	// End constructor
	
	@Override
	public double getPaymentAmount()
	{
		return baseSalary + (super.getGrossSales() * super.getCommissionRate());
	}
	
	@Override
	public String toString()
	{
		return super.getFirstName()+", "+super.getLastName()+", "+super.getLastName()+", "+super.getSocialSecurityNumber()
		+", "+baseSalary;
	}
}
