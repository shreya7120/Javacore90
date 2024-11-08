package innerclass;


class DemoA  //outer class
{
	int age=40;
	public void show()
	{
		System.out.println("I am show method in outer class DmeoA...");
	}
	class DemoB  //inner class
	{
		int age=90;
		public void yapu()
		{
			System.out.println("I am yapu method inside inner class DemoB...");
		}
		
		public void yapu2()
		{
			System.out.println("I am yapu2 inside inner class DemoB...");
		}
		
	}//inner class closed
}//outer class closed 



public class InnerExe1 {

	public static void main(String[] args) {
		
		//Creating object of outer class DemoA'
		DemoA obj=new DemoA();
		obj.show();   //called method from outer
		System.out.println("Age : "+obj.age);  //called outer var age
		
		//to create object of inner class used object of outer class with (.) operator cause it belongs to outer
		
//		DemoA.DemoB obj2=new DemoA().new DemoB();
		//another way is 
		DemoA.DemoB obj2=obj.new DemoB();
		obj2.yapu();
		obj2.yapu2();
		System.out.println("Age from inner : "+obj2.age);
		
		
		
		
	}

}
