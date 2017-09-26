package lesson12;

import java.util.Scanner;

public class CustomerAccount 
{
	private String cusName;
	private String accNo;
	private double balance;
	
	public CustomerAccount(double balance)
	{
		this.balance = balance;
	}
	
	public void deposit(double balance)
	{
		this.balance = balance * balance;
	}
	
	public void withdraw(double balance) //throws MyExcept
	{
		try
		{
			if(balance > this.balance)
			{
				throw new MyExcept("Amount value is greater than your balance");
			}
			if(this.balance - balance < 100)
			{
				throw new MyExcept("Can't withdraw because your balance will less 100");
			}
			
			this.balance = this.balance - balance;
			System.out.println("Withdraw successful, your balance is: "+ this.balance);
		}
		catch(MyExcept e)
		{
			System.out.println(e);
		}
		
	}
	
	public static void main(String[] args)
	{
		CustomerAccount c = new CustomerAccount(2000);
		Scanner sc = new Scanner(System.in);
		System.out.println("To withdraw press 1 <=> To make a deposit press 2: ");
		int v = sc.nextInt();
		if(v == 1)
		{
			System.out.print("Enter the amount to withdraw : ");
			v = sc.nextInt();
			
			c.withdraw(v);
			
		}
	}
}
