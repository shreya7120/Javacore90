package innerclass;


class A1
{
	int age=49;
	
	public void show()
	{
		System.out.println("I am show method inside outer class A1...");
	}
	
	static class B1
	{
		int age=34;
		public void yapu()
		{
			System.out.println("I am yapu method inside static inner class B1... ");
		}
		
	}//static inner class closed
}//outer class closed


public class InnerExe2 {

	public static void main(String[] args) {
		
		A1 obj=new A1();
		obj.show();
		System.out.println("Age from outer : "+obj.age);
		
		//To create object of static class we don't need obj
		A1.B1 obj2=new A1.B1();
		obj2.yapu();
		System.out.println("Age from static inner class : "+obj2.age);

	}

}
