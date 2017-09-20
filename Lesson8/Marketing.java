package lesson8;

import java.util.ArrayList;
import java.util.List;

public class Marketing 
{
	private String employeeName;
	private String productName;
	private double salesAmount;
	
	//List<Marketing> lstMar = new ArrayList<>();
	
	@Override
	public String toString()
	{
		return "Employee Name: " + employeeName + ", Product Name: " + productName + ", Sales Amount: " + salesAmount + "\n";
	}
	
	public Marketing(String employeeName, String productName, double salesAmount)
	{
		this.employeeName = employeeName;
		this.productName	 = productName;
		this.salesAmount = salesAmount;
	}
	
	// Getter
	public double getSalesAmount()
	{
		return salesAmount;
	}
	public String getEmployeeName()
	{
		return employeeName;
	}
	@Override
	public boolean equals(Object obj) 
	{
		if(obj == null) return false;
		if(!(obj instanceof Marketing))
			return false;
		
		Marketing m = (Marketing) obj;
		return m.getSalesAmount() == salesAmount;
	}
}
