package interface_about;

interface A
{
	default void show()
	{
		System.out.println("show from A interface");
	}
}

interface B
{
	default void show()
	{
		System.out.println("show from B interface");
	}
}




public class C implements A,B{
	
	public void show()
	{
		System.out.println("show From C class");
	}

	public static void main(String[] args) {
		
		C obj=new C();
		obj.show();

	}

}
