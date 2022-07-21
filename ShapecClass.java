//Create a class named 'Shape' with a method to print "This is this is shape".
//Then create two other classes named 'Rectangle', 'Circle' inheriting the
//Shape class, both having a method to print "This is rectangular shape" and
//"This is circular shape" respectively. Create a subclass 'Square' 'Rectangle' having a method to print "Square is a rectangle". Now call the
//method of 'Shape' and 'Rectangle' class by the object of 'Square' class.
// W.A.J. P to demonstrate try catch block,
package modual2;
class Shape1
{
	public void print()
	{
		System.out.println("this is shape");
	}
}
class Rectangle extends Shape1
{
	public void print1()
	{
		System.out.println("this is rectangle");
	}
}
class Circle extends Shape1
{
	public void print2()
	{
		System.out.println("this is circle");
	}
}
class Square1 extends Rectangle
{
	public void print3()
	{
		System.out.println("Square is Rectangle");
	}
}
public class ShapecClass {
	
	public static void main(String[] args)
	{
		Square1 s=new Square1();			
		s.print();
		s.print3();	
	}
}

