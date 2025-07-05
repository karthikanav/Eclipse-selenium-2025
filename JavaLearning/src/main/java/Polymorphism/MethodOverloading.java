package Polymorphism;

public class MethodOverloading {
	public void add(int a, int b) {
		System.out.println(a+" "+b);
		
	}
	public void add(int a, float b) {// change the data type from int to float
	System.out.println(a+" "+b);	
	}
	
	public void studentDetails(String name, int id) {
		System.out.println(name+" "+ id);
		
	}
	public void studentDetails( long phono, String Address) {
		System.out.println(phono+"  "+ Address);
		
	}
	
public void studentDetails(String state, String name, int id) {
	System.out.println(state+  " "+ name+id);
		
	}

public void studentDetails( String name, int id, String state) { // same data type but can be rearranged
	System.out.println(id+" "+ id+" "+ state);
}

public static void main(String[]args) {
	MethodOverloading poly=new MethodOverloading();
	poly.studentDetails("kevin", 89);
	poly.studentDetails(720451903, "bankst");
	
	
}

	
	

}
