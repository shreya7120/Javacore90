package interface_about;



interface I
{
	default void show()
	{
		System.out.println("show from I interface");
	}
}

interface I2
{
	default void show()
	{
		System.out.println("show from I2 interface");
	}
}

class ThirdRule
{
	public void show()
	{
		System.out.println("show from ThirdRule class");
	}
}


public class C2 extends ThirdRule implements A,B{
	
	
	public static void main(String[] args) {
		
		C2 obj=new C2();
		obj.show();  //now this will call method of ThirdRule class b'coz class has high priority than interface

		//And obviously then normal methods of class has higher priority than interface's default methods
	}

}
