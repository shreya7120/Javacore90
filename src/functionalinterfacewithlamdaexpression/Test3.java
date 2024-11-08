package functionalinterfacewithlamdaexpression;

@FunctionalInterface
interface FunInter3
{
	void show(int a,int b);
}



public class Test3 {

	public static void main(String[] args) {
		
		/*FunInter3 obj=new FunInter3()
		{
			public void show(int a, int b)
			{
				System.out.println("In show : "+a+" "+b);
			}
		}; 

		//calling behavior
		obj.show(17, 17);  */
		
		
		//Case 2
		FunInter3 obj=(a,b)->System.out.println("In show : "+a+" "+b);

		//calling behavior
		obj.show(17, 17);
		
//case 3  if you have mutiple methods then you have to use curly braces and semicolon at the end of expression
		FunInter3 obj1=(a,b)->
		{
			System.out.println("In show : "+a);
			System.out.println("b = "+b);
		}
		;
		
		obj1.show(50, 45);
		
		
		
	}

}
