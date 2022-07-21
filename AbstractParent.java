// Create an abstract class 'Parent' with a method 'message'. It has two
//subclasses each having a method with the same name 'message' that
//prints "This is first subclass" and "This is second subclass" respectively.
//Call the methods 'message' by creating an object for each subclass.






package modual2;


 abstract  interface Super

{
	
	public void msg();
}
class sb1 implements Super

{

	@Override
	public void msg() {
		System.out.println("this is first subclass");
	}
	
}
class sb2 implements Super
{

	@Override
	public void msg() {
		System.out.println("this is second subclass");		
	}
	
}

public class AbstractParent {

	
	public static void main(String[] args)
	{
		sb1 s1=new sb1();
		sb2 s2=new sb2();
		
		s1.msg();
		s2.msg();
		
		
	}
	
}
