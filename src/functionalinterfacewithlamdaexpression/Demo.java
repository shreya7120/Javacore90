package functionalinterfacewithlamdaexpression;

import java.util.ArrayList;
import java.util.List;

public class Demo {
	

	void m1() {
		List<String> list = new ArrayList<>();
		list.add("java");
		list.add("Swift");
		list.add("python");
		list.add("java");
		list.stream().filter(var -> var.equals("java")).forEach(var -> System.out.println(var));
		
	}

		void m2() 
		{
			List<String> list = new ArrayList<>();
			list.add("java");
			list.add("Swift");
			list.add("python");
			list.add("java");
			list.stream().filter(var -> var.equals("python")).forEach(System.out::println);

		}

	public static void main(String[] args) {

		
        Demo d1=new Demo();
        d1.m1();
        d1.m2();
        
    }
	
}
