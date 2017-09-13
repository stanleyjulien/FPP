package lesson5;
import java.time.LocalDate;

public class Secretary extends DeptEmployee
{
	protected double overtimeHours;
	
	public Secretary(String name, double salary, LocalDate hireDate, double overtimeHours)
	{
		super(name, salary, hireDate);
		this.overtimeHours = overtimeHours;
	}
	
	public void setOvertimeHours(double overtimeHours)
	{
		this.overtimeHours = overtimeHours;
	}
	
	public double getOvertimeHours()
	{
		return overtimeHours;
	}
	
	@Override
	public double computeSalary()
	{
		double sal;
		sal = super.computeSalary() + 12 * overtimeHours;
		
		return sal;
		
	}
}
