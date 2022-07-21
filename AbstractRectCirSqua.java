// We have to calculate the area of a rectangle, a square and a circle. Create
//an abstract class 'Shape' with three abstract methods namely
//'RectangleArea' taking two parameters, 'SquareArea' and 'CircleArea'
//taking one parameter each. The parameters of 'RectangleArea' are its
//length and breadth, that of 'SquareArea' is its side and that of 'CircleArea'
//is its radius. Now create another class 'Area' containing all the three
//methods 'RectangleArea', 'SquareArea' and 'CircleArea' for printing the
//area of rectangle, square and circle respectively. Create an object of class
//'Area' and call all the three methods. 
package modual2;


abstract class Shape

{
	 abstract void RectangleArea (int length,long breath);
	 abstract void SquarArea(int sides);
	 abstract void CircleArea(float radius);
}

class Area extends Shape

{

	@Override
	void RectangleArea(int length, long breath) {
		
		System.out.println("the Area of rectangle is :"+(length*breath));
				
	}

	@Override
	void SquarArea(int sides) {
		
		System.out.println("the area of circle :"+(sides*sides));
	}

	@Override
	void CircleArea(float radius) {
		
		System.out.println("the area of circule is :"+(3.14*radius*radius));
				
	}
	
}

public class AbstractRectCirSqua {
	
	public static void main(String[] args) 
	{
		Area  a=new Area();
		
	    a.RectangleArea(5,10);
	    a.SquarArea(6);
		a.CircleArea(6f);

		
	}
	
}
