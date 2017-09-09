package lesson3;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class MyDate 
{
	private LocalDate date;
	private static int month;
	private String monthN;
	private int day;
	private int year;
	public MyDate(int month, int day, int year) 
	{
		this.month = month;
		this.day = day;
		this.year = year;
		//date = LocalDate.of(year, month, day);
	}
	
	public MyDate(String monthN, int day, int year) 
	{
		this.monthN = monthN;
		this.day = day;
		this.year = year;
		//date = LocalDate.of(year,Month.valueOf(monthN), day);
	}
	
	public MyDate(int day, int year) 
	{
		//date = LocalDate.of(year,month,day);
		this.day = day;
		this.year = year;
		
	}
	
	public String getDate(int choice)
	{
		if(choice == 1)
		{
			String d =  month+"/"+day+"/"+year;
			String res = "";
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("M/d/yyyy");
			LocalDate da = LocalDate.parse(d, formatter);
			res = "MM/dd/YYYY:"+
					da.getMonthValue()+"/" +da.getDayOfMonth() + "/" + da.getYear()
			+"\n"
			+"MMMM DD, YYYY:" +da.getMonth()+ " "+  da.getDayOfMonth() + " ," + da.getYear()
			+"\n"
			+"DDD YYYY:" +da.getDayOfYear() + " " + da.getYear();
			//DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
			return res; //date.format(formatter);
			//return date;
		}
		else if(choice == 2)
		{
			String d = monthN+" "+day+","+year;
			String res = "";
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM d,yyyy");
			LocalDate da = LocalDate.parse(d, formatter);
			res = "MM/dd/YYYY:"+
					da.getMonthValue()+"/" +da.getDayOfMonth() + "/" + da.getYear()
			+"\n"
			+"MMMM DD, YYYY:" +da.getMonth()+ " "+  da.getDayOfMonth() + " ," + da.getYear()
			+"\n"
			+"DDD YYYY:" +da.getDayOfYear() + " " + da.getYear();
			//DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
			return res;
		}
		else
		{
			String d = day+" "+year;
			String res = "";
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("D yyyy");
			LocalDate da = LocalDate.parse(d, formatter);
			res = "MM/dd/YYYY:"+
					da.getMonthValue()+"/" +da.getDayOfMonth() + "/" + da.getYear()
			+"\n"
			+"MMMM DD, YYYY:" +da.getMonth()+ " "+  da.getDayOfMonth() + " ," + da.getYear()
			+"\n"
			+"DDD YYYY:" +da.getDayOfYear() + " " + da.getYear();
			//DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
			return res;
		}
	}
	
}
