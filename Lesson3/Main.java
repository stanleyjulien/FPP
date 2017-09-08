package lesson3;

public class Main 
{
	public static void main(String[] args) 
	{
		
		Customer[] cus = new Customer[3];
		
		Customer c1 = new Customer("Thomas","Peter","0001");
		Customer c2 = new Customer("Stephany","Jean","0002");
		Customer c3 = new Customer("Deborah","Alexander","0003");
		
		Address a1	= new Address("1000 North 4Th","Fairfield","Iowa","52557");
		Address a2	= new Address("1200 West Harrison St.","Chicago","Illinois","60637");
		Address a3	= new Address("5801 South Ellis Avenue","Chicago","Illinois","60637");
		
		c1.setBillingAddress(a1);
		c2.setBillingAddress(a2);
		c3.setBillingAddress(a3);
		
		cus[0] = c1; 
		cus[1] = c2;
		cus[2] = c3;
		
		for(int i = 0; i < cus.length; i++)
		{
			if(cus[i].getBillingAddress().getCity() == "Chicago")
			{
				System.out.println(cus[i].toString()+", "+cus[i].getBillingAddress().getStreet()+" "
				+ cus[i].getBillingAddress().getCity()+", "+ cus[i].getBillingAddress().getState()
				+" "+cus[i].getBillingAddress().getZip());
			}
		}
	}
}

/*Result
[Stephany, Jean, ssn: 0002], 1200 West Harrison St. Chicago, Illinois 60637
[Deborah, Alexander, ssn: 0003], 5801 South Ellis Avenue Chicago, Illinois 60637
 */