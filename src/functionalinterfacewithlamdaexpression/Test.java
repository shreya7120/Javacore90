package functionalinterfacewithlamdaexpression;

//we can override methods of interface by creating anonymous class of it 

@FunctionalInterface
interface FunInter
{
  void show();  //it's public by default
}


public class Test {

	public static void main(String[] args) {
		
//		FunInter obj1=new FunInter()
//		{
//			public void show()
//			{
//				System.out.println("hey I am show in anonymous");
//			}
//		};
		
		
		//Another way to write same code in reduced lines
//		FunInter obj1=()->
//			{
//				System.out.println("hey I am show in anonymous");
//			}
//		;
//		obj1.show();
		
		/*Third way to reduction of code is we can skip those curly braces before & after statement
		if you have only one sout("") and remove semicolon as well ' ; '   but require in multiple statemnts*/
		
		FunInter obj1=()-> System.out.println("hey I am show in anonymous");
		
		obj1.show();
		

	}

}
