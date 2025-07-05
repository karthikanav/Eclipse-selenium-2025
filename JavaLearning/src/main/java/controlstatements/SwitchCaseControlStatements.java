package controlstatements;

public class SwitchCaseControlStatements {

	public static void main(String[] args) {
		
		String browser="Chrome";
		
		switch(browser){
		
		case "Edge" :{
			System.out.println("The given browser is Edge");
			break;
		}
		case"Chrome":{
			System.out.println("The given browser is Chrome");
		}break;
		
		// The jump control statement is associated with switch case statements to satisfy the string which is declared, and to match up with the logic inside of each code and, skip the unwanted logic to execute 
		case"Firefox":{
			System.out.println("The given browser is Firefox");
		}
		
		case"IE":{
			System.out.println("The given browser is IE");
		}
		default:{
			System.out.println("Check your Input"); // If none of the input logic is matching up with the browser then we can use default statement
		}
		

	}

}
}
