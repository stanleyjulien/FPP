package lesson5;

public class Invoice implements Payable
{
	private String partNumber;
	private String partDescription;
	private int quantity	;
	private double pricePerItem;
	
	// Constructor
	public Invoice(String partNumber, String partDescription, int quantity, double pricePerItem)
	{
		this.partNumber = partNumber;
		this.partDescription = partDescription;
		this.quantity = quantity;
		this.pricePerItem = pricePerItem;
	}
	// End constructor
	
	@Override
	public double getPaymentAmount()
	{
		return quantity * pricePerItem;
	}
	
	@Override
	public String toString()
	{
		return "Part number: " + partNumber + ", Part description: " + partDescription + ", Quantity: " + quantity + "pricePerItem: " + pricePerItem;
	}
	
}
