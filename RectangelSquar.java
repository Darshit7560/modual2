//Create a class named 'Rectangle' with two data members 'length' and
//'breadth' and two methods to print the area and perimeter of the
//rectangle respectively. Its constructor having parameters for length and
//breadth is used to initialize the length and breadth of the rectangle. Let
//class 'Square' inherit the 'Rectangle' class with its constructor having a
//parameter for its side (suppose s) calling the constructor of its parent class
//as 'super (s, s)'. Print the area and perimeter of a rectangle and a square.



package modual2;

class Rectangal
{
	
	int length,breadth;
	public  Rectangal(int length,int breadth)
	{
		this.length=length;
		this.breadth=breadth;
	}
	void print_area()
	{
		System.out.println("the area of rectangal is "+(length*breadth));
	}
	void print_perimetr()
	{
		System.out.println("the perimeter is "+(2*(length+breadth)));
	}
}
class Square extends Rectangal

{

	public Square(int s)
	{
		super(s, s);
	}
	
}

public class RectangelSquar {
	
	public static void main(String[] args) 
	{
		Rectangal r=new Rectangal(1,5);
		Square s=new Square(2);
		
		r.print_area();
		r.print_perimetr();
		s.print_area();
		s.print_perimetr();
		
	}

}
