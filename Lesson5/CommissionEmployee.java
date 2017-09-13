package lesson5;

public class CommissionEmployee extends Employee
{
	private double grossSales;
	private double commissionRate;
	
	// Constructor
	public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate)
	{
		super(firstName, lastName, socialSecurityNumber);
		this.grossSales = grossSales;
		this.commissionRate = commissionRate;
		
	}
	// End constructor
	
	// Getter
	public double getGrossSales()
	{
		return grossSales;
	}
	
	public double getCommissionRate()
	{
		return commissionRate;
	}
	// End getter
	
	@Override
	public double getPaymentAmount() {
		return grossSales * commissionRate;
	}
	
	@Override
	public String toString()
	{
		return super.getFirstName()+", "+super.getLastName()+", "+super.getLastName()+", "+super.getSocialSecurityNumber()
		+", "+grossSales+", "+commissionRate;
	}
	
	
}
