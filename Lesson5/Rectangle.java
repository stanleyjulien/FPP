package lesson5;

public class Rectangle extends Shape{
	protected double width;
	protected double height;
	
	public Rectangle(String color, double width, double height)
	{
		super(color);
		this.width = width;
		this.height = height;
	}
	
	@Override
	public double calculateArea()
	{
		double area = width * height;
		return area;
	}
	
	@Override
	public double calculatePerimeter()
	{
		return 2 * width + 2 * height;
	}
}
