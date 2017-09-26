package lesson12;

import java.util.Scanner;

public class RangeMark 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String s = "";
		int num = 0;
		try
		{
			while(true)
			{
				System.out.print("Enter the mark (from 0 to 100) : ");
				s = sc.next();
				num = Integer.parseInt(s);
				if(num < 0)
				{
					//System.out.println("Your number \""+ num+"\" cannot be negative");
					throw new IllegalArgumentException("Your number \""+ num+"\" cannot be negative");
				}
				else if(num > 100)
				{
					System.out.println("Your number \""+ num+"\" cannot be greater than 100");
				}
				else
				{
					System.out.println("Your mark is : " + num);
					break;
					
				}
			}
			
		}
		catch(NumberFormatException e)
		{
			System.out.println("This is \""+s+"\" not a number : "+e.getMessage());
		}
		catch(IllegalArgumentException e)
		{
			System.out.println(e.getMessage());
		}
		
		sc.close();

	}

}
