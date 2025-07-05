package week1.day1.test;

public class LearnSwitchCase {

	public static void main(String[] args) {
		
		// If condition satisfy rest of the cases also will execute
		String browser = "Safari";
		switch (browser) {
		case "Edge":{
			System.out.println("Launch the Edge Browser" );
		}
		
		
		case"chrome":{
			System.out.println("Launch the chrome Broswer");
		}
		case"Firefox":{
			System.out.println("Launch the Firefox Browser");
		}break;
		
		case"Safari":{
			System.out.println("Launch the Sarari");
		}
		break;
		
		default:
		{
			System.out.println("Check the input");
		}
		
		}

	}


}
