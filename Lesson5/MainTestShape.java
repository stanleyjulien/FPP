package lesson5;

public class MainTestShape 
{
	public static void printTotal(Shape[] a)
	{
		for(int i = 0; i < a.length; i++)
		{
			if(a[i] != null)
			{
				System.out.println("Area: "+a[i].calculateArea()+", Perimeter: "+ a[i].calculatePerimeter());
			}
		}
	}
	
	public static void main(String[] args)
	{
		Shape[] shape = new Shape[5];
		
		shape[0] = new Rectangle("black", 5.6, 3.4);
		shape[1] = new Circle("Red", 8.2);
		shape[2] = new Square("Blue", 5);
		
		MainTestShape.printTotal(shape);
	}
}
