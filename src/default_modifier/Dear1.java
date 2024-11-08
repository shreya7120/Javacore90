package default_modifier;

//Class cannot be protected 
//class Dear1     here class was default that's why not accessible to other package classes 
public class Dear1 {   //but now it is public and accessible 
	
	protected void m1()
	{
		System.out.println("I am protected...");
	}
	
	 void m2()      //default method only accessible to this package
	{
		System.out.println("Hi I am default method m2...");
	}
	 
	 private void varsha()   //private method not accessible outside this class
	 {
		 System.out.println("Hey I am varsha...");
	 }
	 
//	 public static void main(String[] args)
//	 {
//		 Dear1 obj=new Dear1();
//		 obj.varsha();
//	 }

}
