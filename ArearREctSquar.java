//Create a class to print the area of a square and a rectangle. The class has
//two methods with the same name but different number of parameters.
//The method for printing area of a rectangle has two parameters which are
//length and breadth respectively while the other method for printing area
//of square has one parameter which is side of square.


package modual2;

public class ArearREctSquar {
	
	
	void Area(int length,int width)
	{
		System.out.println("the area of rectangal is:"+(length*width));
	}
	
	
	void Area(int side)
	
	{
		System.out.println("the  Area of Square : "+(side*side));
	}

	
	public static void main(String[] args)
	{
		ArearREctSquar a=new ArearREctSquar();
		
		a.Area(10,15);
		a.Area(50);
	}
	
}
