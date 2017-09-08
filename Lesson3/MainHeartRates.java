package lesson3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class MainHeartRates 
{
	public static void main(String[] args) 
	{
		String fName, lName, dateOfBirth;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("First Name: ");
		fName = scan.next();
		System.out.println();
		System.out.print("Last Name: ");
		lName = scan.next();
		System.out.print("Date of Birth (MM/d/yyyy): ");
		dateOfBirth = scan.next();
		System.out.println();
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
		LocalDate date = LocalDate.parse(dateOfBirth, formatter);
		
		HeartRates ratesHeart = new HeartRates(fName,lName,date);
		
		System.out.println(ratesHeart.toString());
		scan.close();
	}
}

/*
First Name: Christopher

Last Name: Miller
Date of Birth (MM/d/yyyy): 10/07/1984

128.5, 169.45
Christopher; Miller; 1984-10-07; 33; 187; 128.5, 169.45
*/
