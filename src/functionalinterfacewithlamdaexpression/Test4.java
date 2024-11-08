package functionalinterfacewithlamdaexpression;

@FunctionalInterface
interface FunInter4
{
	int add(int a,int b);
}

public class Test4 {

	public static void main(String[] args) {
		
//		FunInter4 obj=new FunInter4()
//		{
//			public int add(int a,int b)
//			{
//				return a+b;
//			}
//		};
//		
//		//calling method
//		int result=obj.add(6, 5);
//		System.out.println("Addition : "+result);
		
		//CASE 2
	/*	FunInter4 obj=(int a,int b)->
			{
				return a+b;
			}
		;
		
		//calling method
		int result=obj.add(6, 5);
		System.out.println("Addition : "+result);  */
		

		//CASE 3  as there is only one statmt then can remove braces nd ; also
		//but can't write return keyword cause returning only one statement
		
		//FunInter4 obj=(int a,int b)->a+b;     
		FunInter4 obj=(a,b)->a+b;  	  // we can remove type also from small brackets
		
		//calling method
		int result=obj.add(6, 5);
		System.out.println("Addition : "+result);
		
		//POINT TO REMEMBER IS 
		//Lamda expression only works with function interface
		// cause suppose we have two methods add() and sub()
		//and when u write lamda expression so which method u r implementing , confusion occurs
	}

}
