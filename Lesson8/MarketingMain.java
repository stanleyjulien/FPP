package lesson8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MarketingMain implements Comparator<Marketing> //, Comparable<Marketing>
{
	public static List<Marketing> listMoreThan1000(List<Marketing> list)
	{
		 // Implement a body
		List<Marketing> lRes = new ArrayList<>();
		for(Marketing l : list)
		{
			if(l.getSalesAmount() > 1000)
			{
				lRes.add(l);
			}
		}
		
		return lRes;
	}
	
	
	
	@Override
	public int compare(Marketing o1, Marketing o2) {
		if(o1.getSalesAmount() < o2.getSalesAmount())
			return -1;
		else if(o1.getSalesAmount() > o2.getSalesAmount())
			return 1;
		else
			return 0;
		
	}

	
	public static void main(String[] args)
	{
		MarketingMain mm = new MarketingMain();
		List<Marketing> lstMar = new ArrayList<>();
		
		lstMar.add(new Marketing("Stephany Leman","Jeans",25));		
		lstMar.add(new Marketing("Jackman Hill","Watch",100.99));		
		lstMar.add(new Marketing("Pau Kahn","Jewels",500.99));
		lstMar.add(new Marketing("Barcleys Charles","Cellphone",245.90));		
		lstMar.add(new Marketing("Jason Parker","Ball",20.99));		
		lstMar.add(new Marketing("Henry Carl","Sun Glasses",1200.99));
		lstMar.add(new Marketing("Max Alex","Guitar",2000.99));
		
		lstMar.remove(1);
		
		lstMar.set(0,new Marketing("Stephany Leman John","Jeans",25));
		
		System.out.println(lstMar.size());
		System.out.println(lstMar);
		Marketing m1 = new Marketing("Stephany Leman","Jeans",25);
		Marketing m2 = new Marketing("Stephany Leman","Jeans",25);
		
		System.out.println(mm.compare(m1, m2));
		System.out.println(m1.equals(m2));
		Collections.sort(lstMar, mm);
		System.out.println(lstMar);
		
		List<String> l = new ArrayList<>();
		Collections.sort(l);
		
		List<Marketing> lM = listMoreThan1000(lstMar);
		Comp c = new Comp();
		System.out.println(c.compare(m1, m2));
		System.out.println(m1.equals(m2));
		Collections.sort(lM, c);
		System.out.println(lM);
		//System.out.println(x);
	}
	
	public static class Comp implements Comparator<Marketing>
	{
		@Override
		public int compare(Marketing o1, Marketing o2)
		{
			return (o1.getEmployeeName().compareTo(o2.getEmployeeName()) );
			
		}
	}
}
/*Result
6
[Employee Name: Stephany Leman John, Product Name: Jeans, Sales Amount: 25.0
, Employee Name: Pau Kahn, Product Name: Jewels, Sales Amount: 500.99
, Employee Name: Barcleys Charles, Product Name: Cellphone, Sales Amount: 245.9
, Employee Name: Jason Parker, Product Name: Ball, Sales Amount: 20.99
, Employee Name: Henry Carl, Product Name: Sun Glasses, Sales Amount: 1200.99
, Employee Name: Max Alex, Product Name: Guitar, Sales Amount: 2000.99
]
0
true
[Employee Name: Jason Parker, Product Name: Ball, Sales Amount: 20.99
, Employee Name: Stephany Leman John, Product Name: Jeans, Sales Amount: 25.0
, Employee Name: Barcleys Charles, Product Name: Cellphone, Sales Amount: 245.9
, Employee Name: Pau Kahn, Product Name: Jewels, Sales Amount: 500.99
, Employee Name: Henry Carl, Product Name: Sun Glasses, Sales Amount: 1200.99
, Employee Name: Max Alex, Product Name: Guitar, Sales Amount: 2000.99
]
0
true
[Employee Name: Henry Carl, Product Name: Sun Glasses, Sales Amount: 1200.99
, Employee Name: Max Alex, Product Name: Guitar, Sales Amount: 2000.99
]

*/