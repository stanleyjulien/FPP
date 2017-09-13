package lesson5;

public class Driver 
{
	public static void main(String[] args)
	{
		Figure[] fig = new Figure[4];
		
		UpwardHat up = new UpwardHat();
		DownwardHat dow = new DownwardHat();
		FaceMaker face = new FaceMaker();
		Vertical ver = new Vertical();
		
		
		fig[0] = up;
		fig[1] = dow;
		fig[2] = face;
		fig[3] = ver;
		
		for(Figure f : fig)
		{
			f.getFigure();
		}
		
		for(Figure f : fig)
		{
			System.out.print(f.getClass().getSimpleName()+": ");
			f.getFigure();
			System.out.println();
		}
		
	}
}
