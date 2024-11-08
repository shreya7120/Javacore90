package anonymousclass;

//if YOU want to use or implement a method only at one place or one class then why to even create child class of it 
//just make anonymous clss in that place  (anonymous inner class)

class Ex1
{
	public void show()
	{
		System.out.println("I am show method inside class Ex1...");
	}
}


public class Anonymous1 {

	public static void main(String[] args) {
		Ex1 o1=new Ex1();
		o1.show();
		
		System.out.println("After anonymous ");
		
		//creating Anonymous inner class to override show method()
		Ex1 obj=new Ex1() {
			
			public void show()
			{
				System.out.println("I am show method from anonymous clss");
			}
			
		};
		
		/*second anonymous class , we can have multiple anonymous class but remember same method 
		 will be overridden with same name and definition in it */
		Ex1 obj2=new Ex1()
				{
					
					public void show()
					{
						System.out.println("Hey I am from second anonymous clss...");
					}
				};
		
		obj.show();
		obj2.show();

	}

}
