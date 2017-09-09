package lesson3;
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

public class MainMyDate 
{
	public static void main(String[] args)
	{

		Scanner scan = new Scanner(System.in);
		
		String c = "";
		//char a;
		while(true)
		{
			
			//Scanner scan2 = new Scanner(System.in);
			
			int choice = 0; //, month = 0, day = 0, year = 0;
			System.out.println("Enter 1 for format: MM/DD/YYYY");
			System.out.println("Enter 2 for format: Month DD, YYYY");
			System.out.println("Enter 3 for format: DDD YYYY");
			System.out.println("Enter 4 to exit");
			System.out.println("Choose your choice: ");
			
			choice = Integer.parseInt( scan.nextLine());
			//choice = 3;
			if(choice == 1) 
			{
				int month = 0, day = 0, year = 0;
				//String d = "";
				System.out.println("Enter Month:");
				month = Integer.parseInt( scan.nextLine());
				//month = 10;
				
				System.out.println("Enter Day:");
				day = Integer.parseInt( scan.nextLine());
				//day = 8;
				
				System.out.println("Enter Year:");
				year = Integer.parseInt( scan.nextLine());
				//year = 2017;
				//scan.close();
				
				//DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
				MyDate dateMy = new MyDate(month, day, year);
				String d = dateMy.getDate(choice);
				System.out.println(d);
				/*
				MyDate dateMy2 = new MyDate(Month.of(month).toString(), day, year);
				String d2 = dateMy2.getDate(2);
				System.out.println("MMMM dd,yyyy:"+d2);
				
				MyDate dateMy3 = new MyDate(day, year);
				String d3 = dateMy3.getDate(3);
				System.out.println("DDD yyyy:"+d3);*/
			}
			else if(choice == 2) 
			{
				String month = "";
				int day = 0, year = 0;
				System.out.println("Enter Month:");
				month = scan.nextLine();
				//month = "September";
				
				System.out.println("Enter Day:");
				day = Integer.parseInt( scan.nextLine());
				//day = 8;
				
				System.out.println("Enter Year:");
				//year = Integer.parseInt( scan.nextLine());
				year = 2017;
				//scan.close();
				//Month.valueOf(month);
				//DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
				MyDate dateMy = new MyDate(month, day, year);
				String d = dateMy.getDate(choice);
				System.out.println(d);
				
				/*MyDate dateMy2 = new MyDate(Month.of(month).toString(), day, year);
				String d2 = dateMy2.getDate(2);
				System.out.println("MMMM dd,yyyy:"+d2);
				*/
				
				
			}
			else
			{
				//String month = "";
				int day = 0, year = 0;
				//System.out.println("Enter Month:");
				//month = scan.nextLine();
				//month = "September";
				
				System.out.println("Enter Day:");
				day = Integer.parseInt( scan.nextLine());
				//day = 8;
				
				System.out.println("Enter Year:");
				year = Integer.parseInt( scan.nextLine());
				//year = 2017;
				//scan.close();
				//Month.valueOf(month);
				//DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
				MyDate dateMy = new MyDate(day, year);
				String d = dateMy.getDate(choice);
				System.out.println(d);
				
				/*MyDate dateMy2 = new MyDate(Month.of(month).toString(), day, year);
				String d2 = dateMy2.getDate(2);
				System.out.println("MMMM dd,yyyy:"+d2);
				*/
				
				
			}

			//Scanner scan2 = new Scanner(System.in);
			System.out.println("Do you want to Continue (y/n):");
			c = scan.nextLine();
			

			if(c.equals("n")) 
			{
				System.out.println("Exit");
				break;
			}
			
			
		}
		
		scan.close();
		
		
	}

}

/*
Enter 1 for format: MM/DD/YYYY
Enter 2 for format: Month DD, YYYY
Enter 3 for format: DDD YYYY
Enter 4 to exit
Choose your choice: 
1
Enter Month:
12
Enter Day:
12
Enter Year:
2017
MM/dd/YYYY:12/12/2017
MMMM DD, YYYY:DECEMBER 12 ,2017
DDD YYYY:346 2017
Do you want to Continue (y/n):
y
Enter 1 for format: MM/DD/YYYY
Enter 2 for format: Month DD, YYYY
Enter 3 for format: DDD YYYY
Enter 4 to exit
Choose your choice: 
2
Enter Month:
September
Enter Day:
8
Enter Year:
MM/dd/YYYY:9/8/2017
MMMM DD, YYYY:SEPTEMBER 8 ,2017
DDD YYYY:251 2017
Do you want to Continue (y/n):
2017
Enter 1 for format: MM/DD/YYYY
Enter 2 for format: Month DD, YYYY
Enter 3 for format: DDD YYYY
Enter 4 to exit
Choose your choice: 
*/
