package interface_about;

interface Beverages
{
	
	void tea();
	Boolean equals(String name);
}

class BevImp implements Beverages
{
	public void tea()
	{
		System.out.println("I ma Tea method in impl...");
	}
	public Boolean equals(String name)
	{
		
		System.out.println(name);
		String n1="Varsha";
		boolean result=(n1==name);
		
		return result;
	}
}

public class C3  {
	
	public static void main(String[] args) {
		
		BevImp obj=new BevImp();
		System.out.println(obj.equals("Varsha"));
		
		

	}

}
