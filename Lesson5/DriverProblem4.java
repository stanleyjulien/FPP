package lesson5;

public class DriverProblem4 
{
	public static void main(String[] args)
	{
		Employee[] emp = new Employee[4];
		
		CommissionEmployee comEmp = new CommissionEmployee("Mac Gregor","Peter","2134-45-2378",45.5,10);
		HourlyEmployee hEmp = new HourlyEmployee("Ben","Jean","4576-51-9857",100000,50);
		SalariedEmployee salEmp = new SalariedEmployee("Jim","Cash","9045-10-4356",6000);
		BasePlusCommissionEmployee basePlusComEmp = new BasePlusCommissionEmployee("Pamela","Kate","7147-93-4170",90000,30,20000);
		Invoice inv = new Invoice("BOO001","Book Paper",10,2);
		
		emp[0] = comEmp;
		emp[1] = hEmp;
		emp[2] = salEmp;
		emp[3] = basePlusComEmp;
		//emp[4] = inv;
		//Payable p = inv;
		//Payable p2 = basePlusComEmp;
		//System.out.println(p);
		//System.out.println(p2);
		
 		double sal = 0.0;
		for(Employee e : emp)
		{
			//System.out.println(e);
			sal += e.getPaymentAmount();
			//System.out.println(sal);
		}
		
		System.out.println(sal);
	}
}

/* Result
 * 7726455.0
 * */
