package lesson11;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

public class EmployeeAdmin {
	
	/**
		Returns a list of Employees whose social security number is on the input list socSecNums
		and whose salary is > 80000. The list must be ordered by social security number,
		from lowest to highest. To sort, you must use a Collections sorting method
		and you must define your own Comparator to be used to compare Employees by ssn. 
	*/
	public static List<Employee> prepareReport(HashMap<String, Employee> table, List<String> socSecNums) {
		//IMPLEMENT
		List<Employee> lstEmp = new ArrayList<>();
		for(String s : socSecNums)
		{
			if(table.get(s) != null && table.get(s).getSalary() > 80000)
			{
				lstEmp.add(table.get(s));
			}
		}
		return lstEmp;
		//return null;
		
	}
	
	static class SortBySSN implements Comparator<Employee>
	{
		@Override
		public int compare(Employee e1, Employee e2)
		{
			int val = 0;
			val = e1.getSsn().compareTo(e2.getSsn());
			return val;
		}
	}
	
}
