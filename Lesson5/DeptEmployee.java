package lesson5;

import java.time.LocalDate;

public class DeptEmployee 
{
	protected String name;
	protected double salary;
	protected LocalDate hireDate;
	
	public DeptEmployee(String name, double salary, LocalDate hireDate)
	{
		this.name 	= name;
		this.salary 	= salary;
		this.hireDate	= hireDate;
	}
	
	// Setter
	public void setName(String name)
	{
		this.name = name;
	}
	
	/*public void setSalary(double salary)
	{
		this.salary = salary;
	}*/
	
	public void setHireDate(LocalDate hireDate)
	{
		this.hireDate = hireDate;
	}
	// End setter
	
	// Getter
	public String getName()
	{
		return name;
	}
	
	/*public double getSalary()
	{
		return salary;
	}*/
	
	public LocalDate getHireDate()
	{
		return hireDate;
	}
	// End getter
	
	public double computeSalary()
	{
		return salary;
	}
	
}
