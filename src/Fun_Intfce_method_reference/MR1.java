package Fun_Intfce_method_reference;

//Method reference is used to refer method of functional interface. 
//It is compact and easy form of lambda expression.
//POIN TO REMEMBER 
/* 
 * Method Reference and Lamda expression  can only be used in  context of Functional Interfaces 
 * */
@FunctionalInterface
interface Demo1 {
	
	void show(int age);  //by default public 
	
	default void varsha()
	{
		System.out.println("I am varsha method");
	}
}

public class MR1 {

	public static void main(String[] args) {

	
		//we have reduced code so much 
		Demo1 obj = a ->System.out.println("Hi I am show... ");
		


		// calling method form anonymous class
		obj.show(23);

	}// main closed

}// class closed
