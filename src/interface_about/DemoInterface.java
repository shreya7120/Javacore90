package interface_about;


interface Animal
{
	void roar();
	
//	void bark() {//error b'coz by default all the methods inside interfaces are public abstract 
	//So to create method body , you have to define method using default keyword
	
	//default method in interface 
	default void bark()
	{
		System.out.println("barking dog seldom bite...");
		
	}	
}


class LandAnimal implements Animal
{
	public void roar()
	{
		System.out.println("Lion roars");
	}
}


public class DemoInterface {

	public static void main(String[] args) {
		

		Animal obj=new LandAnimal();
		obj.roar();
		obj.bark();
	}

}
