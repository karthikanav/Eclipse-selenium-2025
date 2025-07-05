package controlstatements;

public class IfElseControlStatements {

	public static void main(String[] args) {
		
		int number =-27;
		
		if (number>0) {
			System.out.print("The given "+number+" is positive");
		}else if(number<0) {
			System.out.print("The given number "+ number+" is negative");
		}else{
			System.out.println("The given number "+number+" is neutral");
			
		}

	}

}
