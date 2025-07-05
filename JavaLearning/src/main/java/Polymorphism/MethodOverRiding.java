package Polymorphism;

public class MethodOverRiding extends MethodOverloading{
	
// up arrow shows override of polymorphism here
	// extend inheritence is important here so that we can write the login inside the overloadmethod
	
	public void studentDetails(String name, int id) {
    //name="Karthika";
   // id=20;

		System.out.println(name+" "+ id);
		
	}
	
	public static void main(String[]args) {
	
	MethodOverRiding obj =new MethodOverRiding();
	obj.studentDetails("Sujay", 10); // This is from method over ridding
	obj.add(0, 0); // This is from method overloading 
	}
	 
	
}
