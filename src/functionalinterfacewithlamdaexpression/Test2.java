package functionalinterfacewithlamdaexpression;

//suppose the abstract method has some parameter then how to declare them while reducing code or with lamda
//EXPRESSION

interface FunInter2
{
  void show(int age);  //it's public by default
}



public class Test2 {
	
	public static void main(String[] args)
	{
		
	// 1 way simple , understanding  
	
//	FunInter2 obj=new FunInter2()
//			{
//				public void show(int age)
//				{
//					System.out.println("In show "+"age : "+age);
//				}
//			};
//
//			obj.show(22);
		
	
		
		
		// 2 Using lamda expresion 
		
//		FunInter2 obj=(int age)-> System.out.println("In show "+"age : "+age);
//			
//
//		obj.show(22);
		
		
		//3 case , we don't need to mention variable type again in anonymous class as we've already mentioned it 
		// in original representation interface 
		
		FunInter2 obj=(age)-> System.out.println("In show "+"age : "+age);
		obj.show(22);
		
		//4 We can have multiple parameters also 
	}
}
