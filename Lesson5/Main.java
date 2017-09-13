package lesson5;
import java.time.LocalDate;
import java.util.Scanner;

public class Main 
{
	public static void main(String[] args)
	{
		Professor p1 = new Professor("John B",200000.0,LocalDate.of(1972, 8, 13),10);
		Professor p2 = new Professor("Chris Joe",250000.0,LocalDate.of(1972, 9, 1),10);
		Professor p3 = new Professor("Lenon Joseph",230000.0,LocalDate.of(2010, 1, 25),1);
		
		Secretary s1  = new Secretary("Marc Anthony",160000.0,LocalDate.of(2005, 7, 1),35);
		Secretary s2  = new Secretary("Stephany Peter",165000.0,LocalDate.of(2000, 5, 10),40);
		//Secretary s3  = new Secretary("Carter Noah",162000.0,LocalDate.of(2010, 12, 2),20);
		
		DeptEmployee[] department = new DeptEmployee[5];
		
		department[0] = p1;
		department[1] = p2;
		department[2] = p3;
		department[3] = s1;
		department[4] = s2;
		
		Scanner scan = new Scanner(System.in);
		String s ="";
		
		System.out.print("Do you want to see the sum of all Professor, Secretary and Department salaries? (Y/N): ");
		s = scan.nextLine();
		if(s.equals("Y"))
		{
			double sumPro = 0.0, sumSec = 0.0, sum = 0.0;
			for(DeptEmployee dep : department)
			{
				
				sum = sum + dep.computeSalary();
				
			}
			/*System.out.println("Sum of all Professor salaries: "+sumPro);
			System.out.println("Sum of all Secretaire salaries: "+sumSec);
			*/
			System.out.println("Sum of all salaries: "+sum);
		}
		scan.close();
	}
}
/*Do you want to see the sum of all Professor, Secretary and Department salaries? (Y/N): Y
Sum of all salaries: 1005900.0
*/