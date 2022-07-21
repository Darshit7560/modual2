//. Write a program to print the area and perimeter of a triangle having
//sides of 3, 4 and 5 units by creating a class named 'Triangle' without any
//parameter in its constructor.


package modual2;

public class Triangal {
	
	int s1=3;
	int s2=4;
	int s3=5;
	
	public static void main(String[] args) 
	{
		Triangal t1=new Triangal();
		int peri=(t1.s1+t1.s2+t1.s3);
		System.out.println("the perimetre o ftriangel is"+peri);
		int sp=(peri/2);
		
		int ar=((((sp*(sp-t1.s1))*(sp-t1.s2))*(sp-t1.s3)));
		int area=(int)Math.sqrt(ar);
		
		System.out.println("the area of Triangal is:"+area);
	}

}
