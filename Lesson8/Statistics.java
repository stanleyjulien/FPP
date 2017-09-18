package lesson8;
import java.util.*;
public class Statistics {
	/** 
	 * Polymorphically computes and returns the sum
	 * of all the salaries of all the staff/teachers in the list.
	 */
	public static double computeSumOfSalaries(List<EmployeeData> aList) 
	{
		double sal = 0.0;
		for(EmployeeData e : aList)
		{
			sal += e.getSalary();
		}
		return sal;
		//return 0.0;
		//implement
		//compute sum of all salaries of people in aList and return
	}
}
