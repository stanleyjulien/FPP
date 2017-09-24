package prob2.solution;

import java.util.List;

public class AccountManager {
	public static double computeAccountBalanceSum(List<Employee> emps) {
		//implement
		double sum = 0.0;
		//Account a;
		for(Employee e : emps)
		{
			List<Account> b = (List<Account>) e.getAccounts();
			//sum += b.getBalance();
			for(Account a : b)
			{
				sum += a.getBalance();
			}
			//sum += ;
			 
			 
		}
		
		return sum;
	}
}
