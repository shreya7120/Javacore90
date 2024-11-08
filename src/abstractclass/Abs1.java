package abstractclass;

abstract class Varsha
{
	public abstract void m1();
	
	public abstract void show();
	
	public abstract void beauty();
}

public class Abs1 {

	public static void main(String[] args) {
		
		//Now why to create again child class to override m1() method let's create anonymous
		
		//Remember we have to implement all same methods in anonymous class those are present in origin class
		Varsha obj=new Varsha()
		{
			public void m1()
			{
				System.out.println("I am m1 method from anonymous clss of Varsha...");
			}

			@Override
			public void show() {
				
				System.out.println("I am show method from anonymous clss of Varsha...");
			}

			@Override
			public void beauty() {
				System.out.println("I am beauty Varsha method from anonymous clss of Varsha...");
				
			}
		};
		
		obj.m1();
		obj.show();
		obj.beauty();
		

	}

}
