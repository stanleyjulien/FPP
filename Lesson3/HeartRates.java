package lesson3;
//import java.util.Date;
import java.time.*;

public class HeartRates 
{
	private String firstName;
	private String lastName;
	private LocalDate dateOfBirth;
	
	//Constructor
	public HeartRates(String firstName, String lastName, LocalDate dateOfBirth) 
	{
		this.firstName	= firstName;
		this.lastName	= lastName;
		this.dateOfBirth	= dateOfBirth;
	}
	
	//Begin getter
	public String getFirstName()
	{
		return firstName;
	}
	
	public String getLastName()
	{
		return lastName;
	}
	
	public LocalDate getDateOfBirth()
	{
		return dateOfBirth;
	}
	//End of getter
	
	//Begin setter
	public void setFirstName(String firstName)
	{
		this.firstName	= firstName;
	}
	
	public void setLastName(String lastName) 
	{
		this.lastName	= lastName;
	}
	
	public void setDateOfBirth(LocalDate dateOfBirth) 
	{
		this.dateOfBirth	= dateOfBirth;
	}
	//End of setter
	
	//Calculate person age
	public int personAge()
	{
		 int age;
		 int curYear = LocalDate.now().getYear();
		 
		 age = curYear - dateOfBirth.getYear();
		 return age;
	}
	
	public int maxHearthRate()
	{
		int max = 0;
		
		max = 220 - personAge();
		
		return max;
	}
	
	public String targetHeartRateRange()
	{
		int restingHarthRate = 70;
		String range = "";
		double lowerBoundary = 0.5;
		double upperBoundary = 0.85;
		int averageHearthRate = maxHearthRate() - restingHarthRate;
		
		double lBTHR = (averageHearthRate * lowerBoundary) + restingHarthRate;
		double uBTHR = (averageHearthRate * upperBoundary) + restingHarthRate;
		range = lBTHR+", "+uBTHR;
		System.out.println(range);
		return range;
	}
	
	public String toString()
	{
		String st = "";
		st	= firstName +"; "+ lastName + "; " + dateOfBirth + "; " + personAge() + "; " 
			  + maxHearthRate() + "; " + targetHeartRateRange();
		return st;
	}
}
