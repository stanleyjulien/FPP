package lesson5;

public class Square extends Rectangle
{
	public Square(String color, double side)
	{
		super(color,side,side);
	}
	
	@Override
	public double calculateArea()
	{
		return super.height * super.height;
	}
	
	@Override
	public double calculatePerimeter()
	{
		return 4 * super.height;
	}
}
